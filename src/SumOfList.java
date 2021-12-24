import java.util.LinkedList;

public class SumOfList {
    public static void main(String[] arg){
        int toInt1,toInt2;

        String val1="";
        String val2="";
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        StringBuilder sb1 = new StringBuilder(val1);
        StringBuilder sb2 = new StringBuilder(val2);
        for (int i=0;i<list1.size();i++){
            sb1.append(list1.get(i));
        }
        val1 = sb1.toString();
        System.out.println(val1);
        for (int i=0;i< list2.size();i++){
            sb2 = sb2.append(list2.get(i));
        }
        val2 = sb2.toString();
        System.out.println(val2);
        int sum = Integer.parseInt(val1)+Integer.parseInt(val2);
        System.out.println("Sum of two linked list: "+sum);
    }
}
