import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] arg){
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("abc");
        strlist.add("def");
        strlist.add("ghi");
        strlist.add("xyz");
        List number = Arrays.asList(2,3,4,5,3);
        strlist.forEach(System.out::println);
        strlist.stream().filter(s->s.startsWith("d")).collect(Collectors.toList());
        strlist.forEach(System.out::println);
        strlist.removeIf(s->s.startsWith("d"));         // use remove if
        strlist.forEach(System.out::println);
        //number.stream().map(i->(i*i)).collect(Collectors.toList()).forEach(System.out::println);
        number.forEach(i->System.out.println(i));
    }
}
