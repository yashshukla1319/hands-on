package streams;

import java.util.List;

public class MatchFirstChar {
    public static void main(String[] args) {
         String ch = "b";
        boolean b = match(List.of("banana", "apple", "pineapple"), ch);
        System.out.println("Even or Not: " + b);

    }

    public static boolean match(List<String> fruits, String ch) {

        boolean b = fruits.stream().anyMatch(s -> s.startsWith(ch));
        System.out.println("Fruit exists: " + b);
        String match = fruits.stream().filter(s -> s.startsWith(ch)).findFirst().orElse(null);
        System.out.println("Matched fruit: " + match);
        return b;
    }
}
