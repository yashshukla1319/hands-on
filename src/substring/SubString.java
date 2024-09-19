package substring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SubString {
    public static void main(String[] args) {
        //int longestSubstring = lengthOfLongestSubstring("abcdab");
        int longestSubstring = lengthOfLongestSubstring("geeksforgeeks");
        System.out.println("Longest substring:" + longestSubstring);
    }

    public static int lengthOfLongestSubstring(String s) {
        List<String> strSub = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) != s.charAt(j) && !sub.contains(String.valueOf(s.charAt(j)))) {
                    sub = sub + s.charAt(j);
                }

            }
            strSub.add(sub);

        }

        System.out.println(strSub);
        System.out.println("Sorted: "+strSub.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList()));
        return strSub.stream().mapToInt(String::length).max().orElse(0);
        //return 0;
    }
}
