package statics;

class Mobile {
    String brand;
    static String name;
    int price;

    static {
        // static block executes only once as everytime when object is created first Class is loaded and then object is instantiated
        // Class is loaded only once and while class is loaded static block is executed, so static block is executed only once
        System.out.println("Inside static block");
        name = "Phone";
    }

    public Mobile() {
        System.out.println("Inside default constuctor");
        this.brand = "";
        this.price = 200;
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}

public class StaticDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // loading class without creating any object
        // Class.forName("Mobile"); // but this throws error mostly
        // System.out.println(".........");

        // so if we dont create any object class is not loaded and hence static block is not executed
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        Mobile.name = "Phone";

        Mobile.show(obj1);


    }
}
