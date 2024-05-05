package oops;

abstract class Car { // you cannot create object of abstract class
    // abstract class can have both normal or abstract method
    Car() {
        System.out.println("Inside Abstract default constructor");
    }
    public abstract void drive(); // abstract method can only be in abstract class
    public void playMusic() {
        System.out.println("Playing Music inside Car");
    }
}

class Hyryder extends Car {
    public void drive() {
        System.out.println("Driving in Hyryder");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car obj = new Hyryder();
        obj.playMusic();
        obj.drive();
    }
}
