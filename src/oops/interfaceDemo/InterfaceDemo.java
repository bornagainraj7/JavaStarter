package oops.interfaceDemo;

interface Computer {
    // all the variables in interface are by default as final and static
    // you don't instantiate an Interface like an object
    // so they don't have their owm memory in heap like objects so you cant have non-final variables
    String location = "Mumbai";
    void code();
}

interface X {
    void run();
}

interface Y extends X {

}

class Laptop1 implements Computer {
    public void code() {
        System.out.println("Code...Compile..Run...");
    }
}

class Desktop1 implements Computer {
    public void code() {
        System.out.println("Code...Compile..Run... Faster");
    }
}

class B implements Computer, X {

    @Override
    public void code() {
        System.out.println("Inside B code...");
    }

    @Override
    public void run() {
        System.out.println("Inside B run");
    }
}

class Developer {
    public void createApp(Computer com) {
        com.code();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Computer lap = new Laptop1();
        Computer desk = new Desktop1();

        Developer d = new Developer();
        d.createApp(lap);
        d.createApp(desk);

        X obj = new B();
        obj.run();

        System.out.println(Computer.location);
        // Computer.location = "HYD";
    }
}
