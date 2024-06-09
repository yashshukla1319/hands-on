package streams;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastSame {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("pop");
        strings.add("qrs");

        List<String> string = strings.stream().filter(s -> !s.isEmpty() && s.endsWith(String.valueOf(s.charAt(0)))).toList();
        System.out.println("Final List: "+string);
    }
}
