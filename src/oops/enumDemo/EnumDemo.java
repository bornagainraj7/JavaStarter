package oops.enumDemo;

enum Status{
    Running, Pending, Success, Failed;
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1600); // these are objects
    private int price;

    private Laptop() {}

    private Laptop(int price) {
        this.price = price;
        System.out.println("Inside: " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s.getClass().getSuperclass());

        Status[] ss = Status.values();

        if (s == Status.Success) {
            System.out.println("Success");
        } else if (s == Status.Failed) {
            System.out.println("Not Good");
        } else if (s == Status.Running) {
            System.out.println("All Good");
        }

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait...");
                break;
            default:
                System.out.println("Succeeded");
        }


        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

//        for (Laptop l: Laptop.values()) {
//            System.out.println(l +" : "+ l.getPrice());
//        }
    }
}
