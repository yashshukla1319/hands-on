import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    private Integer id;
    private String name;

    public Student(Integer id, String name)
    {

        this.id = id;
        this.name = name;
    }
    public Integer getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}


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

        List<Student> lt = new ArrayList<>();

        lt.add(new Student(1, "yash"));
        lt.add(new Student(2, "ronak"));
        lt.add(new Student(3, "dhaval"));

        LinkedHashMap<Integer, String>
                map = lt.stream()
                .collect(Collectors
                .toMap(Student::getId, Student::getName, (x, y) -> x + ", " + y, LinkedHashMap::new));

        map.forEach(
                (x, y) -> System.out.println(x + ": " + y));
    }

}

