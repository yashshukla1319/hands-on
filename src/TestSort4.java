import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {//implements Comparable<Students>
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(String name) {
        this.name = name;
    }



//    @Override
//    public int compareTo(Students o) {
//        return name.compareTo(o.name);
//    }
}

public class TestSort4 {
    public static void main(String[] args) {
        List<Students> al = new ArrayList<>();
        al.add(new Students("Viru"));
        al.add(new Students("Saurav"));
        al.add(new Students("Mukesh"));
        al.add(new Students("Tahir"));

        Collections.sort(al, Comparator.comparing(Students::getName));
        al.sort(Comparator.comparing(Students::getName));
        for (Students s : al) {
            System.out.println(s.name);
        }
    }
}  