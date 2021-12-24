import java.lang.reflect.Array;
import java.util.HashMap;

public class FindDupli {
    public static void main(String[] arg) {
        int[] arr = {1, 3, 2, 1, 4, 3};
        HashMap<Integer, Integer> scoreboard = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (scoreboard.containsKey(arr[i])) {
                scoreboard.put(arr[i], scoreboard.get(arr[i]) + 1);
            } else {
                scoreboard.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (scoreboard.get(arr[i]) != 1) {
                System.out.println("Duplicates are : "+arr[i]);
            }
        }
        System.out.println(scoreboard);
    }
}
