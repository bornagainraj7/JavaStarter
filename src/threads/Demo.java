package threads;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Counter {
    public int count;

    public synchronized void increment() {
        this.count++;
    }

}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
//        A obj1 = new A();
//        B obj2 = new B();
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);

//        t1.start();
//        t2.start();

//        obj1.start(); // works when a class extends Threads
//        obj2.start(); // works when a class extends Threads

        // Runnable with anonymous class and lambda expression
//        Runnable obj3 = () -> {
//            for (int i = 1; i <= 100; i++) {
//                System.out.println("Hey");
//                try {
//                    Thread.sleep(10);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        Thread t3 = new Thread(obj3);
//        t3.start();

        Counter c = new Counter();

        Runnable obj4 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Runnable obj5 = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t4 = new Thread(obj4);
        Thread t5 = new Thread(obj5);

        t4.start();
        t5.start();

        t4.join();
        t5.join();

        System.out.println(c.count);
    }
}
