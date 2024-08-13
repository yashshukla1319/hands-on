package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountNumbers {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        strings.add(1);
        strings.add(0);
        strings.add(0);

        //List<String> string =
        //Map<Integer, List<Integer>> collect = strings.stream().distinct().collect(Collectors.counting());
        Integer collectOne = strings.stream().reduce(0, Integer::sum);
        System.out.println("Final List: "+collectOne);
        System.out.println("Final List: "+(strings.size() - collectOne));

        // Also count occurance

        Map<Integer, Long> occurrences = strings.stream()
                .collect(Collectors.groupingBy(
                        number -> number,
                        Collectors.counting()
                ));

        // Print the occurrences
        occurrences.forEach((number, count) -> System.out.println("Element: " + number + ", Count: " + count));

        String input = "hello world";

        // Count the occurrences of each character
        Map<Character, Long> characterCounts = input.chars()
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(
                        Character::charValue, // Group by character
                        Collectors.counting() // Count occurrences
                ));

        Map<Character, Long> characterCounts2 = input.chars()
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(
                        Character::charValue, // Group by character
                        Collectors.counting() // Count occurrences
                ));

        List<String> list = List.of("abc", "abc", "pqr");

        Map<String, Long> stringCounts = list
                .stream() // Convert int to char
                .collect(Collectors.groupingBy(
                        Function.identity(), // Group by character
                        Collectors.counting() // Count occurrences
                ));

        //characterCounts.forEach((character, count) ->
                System.out.println(stringCounts);
        // Print the result
        characterCounts.forEach((character, count) ->
                System.out.println(character + ": " + count));

    }
}
