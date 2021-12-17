/* String to List with stream */

import java.util.List;
import java.util.stream.Collectors;

public class StrToList {
    public static void main(String[] arg){
        String str = "String to Char List";
        List<Character> list = str
                .chars()                         //Convert to String to IntStream
                .mapToObj((e)->(char)e)           //Convert IntStream to Stream<Character>
                .collect(Collectors.toList());   //Convert IntStream to Stream<Character>
        System.out.println(list);
    }
}
