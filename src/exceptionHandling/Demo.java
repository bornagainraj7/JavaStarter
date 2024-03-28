package exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends RuntimeException {
    public MyException(String str) {
        super(str);
    }
}

class A {
    static {
        System.out.println("Class loaded");
    }
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");

//        try {
//            Class.forName("Calc");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Cannot find the class " + e);
//        }
    }
}

public class Demo {
    public static void main(String[] args) throws IOException {
        int i = 1;
        int j = 0;

//        int[] nums = new int[5];

//        try {
//            j = 18/i;
////            System.out.println(nums[1]);
////            System.out.println(nums[5]);
//            if (j == 0) {
//                throw new ArithmeticException("0 value not allowed");
//            }
//            throw new MyException("Some new exception");
//        } catch (ArithmeticException e) {
////            System.out.println("Cannot divide by zero");
//            j = 18/1;
//            System.out.println("Setting default value...");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Stay in your limit.");
//        } catch (Exception e) {
//            System.out.println("Handling every other exceptions: " + e);
//        }
//


        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find the class " + e);
            e.printStackTrace();
        } finally {
            System.out.println("Bye from catch");
        }

        // try with resource, here it will close the br if it extends AutoCloseable in its hierarchy
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        System.out.println("Bye");
    }
}
