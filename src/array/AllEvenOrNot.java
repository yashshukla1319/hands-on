package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllEvenOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3};
        boolean b = evenOddSort(arr);
        System.out.println("Even or Not: " + b);

    }

    public static boolean evenOddSort(int[] arr) {

        int[] result = new int[arr.length];

        List<Integer> integers = List.of(1, 4, 2, 5);
        boolean b = integers.stream().allMatch(integer -> integer % 2 == 0);
        System.out.println("Even or Not allMatch: " + b);
        if (integers.stream().filter(intege -> intege % 2 != 0).count() > 1) {
            return false;
        } else return true;
        //Arrays.stream(arr).collect();
    }
}
