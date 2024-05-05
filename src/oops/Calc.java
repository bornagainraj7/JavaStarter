package oops;

interface I1 {
    void fun();
    void fun1();
}

interface I2 {
    void fun();
    void fun2();
}

interface I extends I1, I2 {

}

public class Calc implements I {

    public void fun() {}

    public void fun1() {}

    public void fun2() {}


    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}
