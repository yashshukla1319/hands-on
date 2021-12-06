import java.util.ArrayList;
import java.util.List;

public class duplilist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        List<Integer> listcheck = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        System.out.println(list);
        for(Integer i :list){
            if(!listcheck.contains(i)){
                listcheck.add(i);
            }
        }
        System.out.println("No duplicates"+listcheck);
    }
}
