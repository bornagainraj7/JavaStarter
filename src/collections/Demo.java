package collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(8);

        // Collection doesn't have index so need to use List for index

        System.out.println(nums);
        System.out.println(nums.get(3)); // getting based on index in List

        for (int n: nums) {
            System.out.println(n);
        }


        Set<Integer> numSets = new HashSet<Integer>();
        numSets.add(3);
        numSets.add(2);
        numSets.add(6);
        numSets.add(9);


        System.out.println(numSets);

        Set<Integer> numTreeSets = new TreeSet<Integer>();
        numTreeSets.add(8);
        numTreeSets.add(6);
        numTreeSets.add(5);
        numTreeSets.add(9);


        System.out.println(numTreeSets);
    }
}
