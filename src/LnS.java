import java.util.ArrayList;
import java.util.List;

public class LnS {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        int smol = 0;
        int larg = 0;
        for (int i : list) {
            if (smol > list.get(i)) {
                smol = list.get(i);
            }
        }
        for (int i : list) {
            if (larg < list.get(i)) {
                larg = list.get(i);
            }
        }
        System.out.println("Smallest: "+smol);
        System.out.println("Largest: "+larg);
    }
}
