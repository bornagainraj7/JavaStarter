package oops;

public class WrapperDemo {
    public static void main(String[] args) {
        int num = 5;
        // Integer num1 = new Integer(num); // boxing
        Integer num1 = num; // Auto boxing

        // int num2 = num1.intValue(); // unboxing
        int num2 = num1; // auto unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);
    }
}
