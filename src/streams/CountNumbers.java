package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    }
}
