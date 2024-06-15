package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 1);
        integerMap.put(2, 5);
        integerMap.put(3, 9);
        integerMap.put(4, 3);

        Map testMap = new HashMap<>();
        testMap.put(null, 1);
        testMap.put(null, 2);
        System.out.println("Test Map: "+testMap);

        integerMap.entrySet().stream();
        integerMap.forEach((integer, integer2) -> System.out.println(integer+integer));

//        Map m = new HashMap();
//        m.
//        Collections.un
//        Map.Entry
//        Iterable
//        Iterator
        Map<Integer, Integer> collect = integerMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer, LinkedHashMap::new));
        System.out.println("Sorted by value: "+collect);
    }
}
