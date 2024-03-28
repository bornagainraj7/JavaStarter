package oops;

class Human {
    private String name;
    private int age;


    public Human() {
        super();
    }

    public Human(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class OopsDemo {
    public static void main(String[] args) {
        Human obj1 = new Human();  // reference object

        obj1.setAge(25);
        obj1.setName("Raj");

        System.out.println(obj1.toString());

        Human obj2 = new Human("Jay", 19);
        System.out.println(obj2.toString());

        new Human();  // anonymous object, you can't reuse them
    }
}
