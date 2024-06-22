package array;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArraySort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3};
        evenOddSort(arr);

    }
    public static void evenOddSort(int[] arr){
        int[] result = new int[arr.length];

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i=0;i< arr.length;i++){

            if (arr[i] % 2 == 0) {
                //result[i] = arr[i];
                even.add(arr[i]);
            }else {
                odd.add(arr[i]);
            }
        }
        String string = "";
        string.length();
//        for (int i=0;i< result.length;i++){
//            System.out.println(result[i]+", ");
//        }
//        for (int i=0;i< arr.length;i++){
//
//            if (arr[i] % 2 != 0) {
//                odd.add(arr[i]);
//            }
//        }
//        for (int i=0;i< result.length;i++){
//            System.out.println(result[i]+", ");
//        }
        even.addAll(odd);
        System.out.println("Final: "+even);
    }
}
