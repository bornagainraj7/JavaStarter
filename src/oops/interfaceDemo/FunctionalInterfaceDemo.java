package oops.interfaceDemo;

@FunctionalInterface
interface A {
    void show(int i);
}

@FunctionalInterface
interface A1 {
    int add(int i, int j);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // lambda expression
        // lambda expression only works with functional interfaces

        A obj = (i) -> System.out.println("in show with: " + i);

        obj.show(5);


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
