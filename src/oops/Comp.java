package oops;

import java.util.Objects;

class Computer {
    public void show1() {
        System.out.println("In Computer show");
    }
}

class Laptop extends Computer {
    String model;
    int price;

    public String toString() {
        return getClass().getName();
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    public void show2() {
        System.out.println("In Laptop show");
    }
}

public class Comp {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        System.out.println(obj1);
        System.out.println(obj1.equals(obj2));

        // Type casting

        Computer com = new Laptop(); // upcasting
        com.show1();

        Laptop lap = (Laptop) com; // down casting
        lap.show2();

    }
}
