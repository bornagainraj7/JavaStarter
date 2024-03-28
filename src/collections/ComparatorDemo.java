package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;



    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // after implementing this function we don't need custom comparator
    // still if we use Comparator we can override this logic
    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;  // you return 1 when you want to swap, in this case when s1.age(lesser index) is > s2.age(greater index) so swap
        } else {
            return -1;
        }
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(33);
        nums.add(71);
        nums.add(18);
        nums.add(15);
        nums.add(49);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i%10 > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        System.out.println("Unsorted: " + nums);
        Collections.sort(nums, com);
        System.out.println("Sorted: " + nums);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Prabhakar"));
        studs.add(new Student(17, "Ramesh"));
        studs.add(new Student(25, "Jayesh"));
        studs.add(new Student(27, "Magesh"));


        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;  // you return 1 when you want to swap, in this case when s1.age(lesser index) is > s2.age(greater index) so swap
                } else {
                    return -1;
                }
            }
        };

        System.out.println(studs);
        Collections.sort(studs, studentComparator);
        System.out.println(studs);

    }
}
