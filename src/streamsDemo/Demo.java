package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }

//        nums.forEach(n -> System.out.println(n));


        // Stream is used when you dont want to change the data in the original array
        // Stream can be used only once just like the real stream of water
//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//
////        s3.forEach(n -> System.out.println(n));
//
//        int res = s3.reduce(0, (c, e) -> c + e);

        int res = nums.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .reduce(0, (c, e) -> c + e);

        System.out.println(res);

    }
}
