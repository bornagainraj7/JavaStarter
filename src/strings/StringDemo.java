package strings;

public class StringDemo {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = b;

        if (a == b && b == c) { // this compares the address/reference stored in variable
            System.out.println("Equals");
        }

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (s1 == s2) {
            System.out.println("s1 equals to s2");
        } else {
            System.out.println("s1 not equals to s2");
        }

        if (s1.equals(s2)) { // this compares values char by char
            System.out.println("s1 equals to s2");
        } else {
            System.out.println("s1 not equals to s2");
        }
        c = "bello";
        System.out.println(c.length());
        System.out.println("a hashcode: " + a.hashCode());
        System.out.println("b hashcode: " + b.hashCode());
        System.out.println("c hashcode: " + c.hashCode());

        System.out.println("s1 hashcode: " + s1.hashCode());
        System.out.println("s2 hashcode: " + s2.hashCode());

    }
}
