package oops.interfaceDemo;

@FunctionalInterface
interface A {
    void show(int i);

    public static void display() {
        System.out.println();
    }

    default void display2() {
        System.out.println();
    }
}

@FunctionalInterface
interface A1 {
    int add(int i, int j);
}

class A2 {
    public void show() {
        System.out.println("in A2 show");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // lambda expression
        // lambda expression only works with functional interfaces

        A obj = (i) -> System.out.println("in show with: " + i);

        obj.show(5);


        // anonymous class
        // here we have extended class A2 and with curly braces and calling its obj3.show()
        // to show child class which is anonymous class
        A2 obj3 = new A2() {
            @Override
            public void show() {
                System.out.println("Inside anonymous class which extends A2");
            }
        };
        obj3.show();


        A1 obj1 = new A1(){
            public int add(int i, int j) {
              return i + j;
            }
        };

        int res = obj1.add(5, 4);
        System.out.println(res);

        A1 obj2 = (i, j) -> i+j;
        int result = obj2.add(3, 2);
        System.out.println(result);

    }
}
