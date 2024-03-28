package oops;

import com.sun.org.apache.xpath.internal.operations.Bool;

class CalcDemo { // once the class is final no one can inherit it
    public final void show() { // no one can override final method
        System.out.println("in CalcDemo show");
    }

    public final void show(int n) { // but final method can be overloaded
        System.out.println("checking method overloading");
    }

    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }

}

public class FinalDemo {
    public static void main(String[] args) {
        int num = 5;
        num = 7;

        final int n = 7; // constant variable in java
        // n = 6;
    }
}
