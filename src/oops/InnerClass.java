package oops;

class Outer {
    int age;

    public void show() {
        System.out.println("Inside Outer class");
    }

    class Inner {
        public void config() {
            System.out.println("Inside Inner Config");
        }
    }

    static class Inner1 {
        public void configNew() {
            System.out.println("Inside Inner1 configNew");
        }
    }
}

abstract class OAB {
    public abstract void show();

    public abstract void config();
}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner(); // to create object of inner class you need object of outer class or you can create inner class as static
        obj1.config();

        Outer.Inner1 obj2 = new Outer.Inner1();
        obj2.configNew();

        // Anonymous inner class
        Outer obj3 = new Outer() {
            public void show() {
                System.out.println("Inside anonymous inner class");
            }
        };
        obj3.show();

        OAB ob = new OAB() {
            @Override
            public void show() {
                System.out.println("Inside anonymous abstract class show");
            }

            @Override
            public void config() {
                System.out.println("Inside anonymous abstract class config");
            }


        };
    }
}
