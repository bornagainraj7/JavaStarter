package arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArrayDemo {

    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

//    public static int[] linearSearchReturn(int[] arr, int num) {
//        int[] res = new Array();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num) {
//
//            }
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 8};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        int result = linearSearch(nums, 6);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(result);
        }
    }
}
