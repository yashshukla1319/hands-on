package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practical {
    //private static int $;
    static int x=1111;
    static {
        System.out.println(x-- - --x);
        //System.out.println(x--);
        x=x-- - --x;
        System.out.println("x static: "+x);
    }
//    {
//        x=x++ + ++x;
//        System.out.println("x instance: "+x);
//    }
    public static void main(String[] args) throws Exception {

        System.out.println(x);

        int num = 5;
        System.out.println(++num + num++);

        List<String> listOfNames = List.of("yash", "abhishek", "yash");

        Map<String, Long> countMap = listOfNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);

//        try {
//            System.out.println("1");
//            throw new Exception();
//        } catch (Exception e) {
//            //System.out.println("2");
//            throw e;
//            //throw new Exception();
//        } finally {
//            System.out.println("3");
//        }
        String a_b;
        //System.out.print($);
        //System.out.print(a_b);

    }

//        try{
//            int a = 0/2;
//        }catch(Exception e){
//            e.getMessage();
//        }catch(ArithmeticException e){
//            e.getMessage();
//        }


//        try {
//            System.out.println("1");
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("2");
//            try {
//                throw new Exception();
//            } catch (Exception ex) {
//                throw new RuntimeException(ex);
//            }
//        } finally {
//            System.out.println("3");
//        }

//    String s1 = "Java";
//    String s2 = "Java";
//    StringBuilder sb1 = new StringBuilder();
//sb1.append("Ja").append("va");
//System.out.println(s1 == s2);
//System.out.println(s1.equals(s2));
//System.out.println(sb1.toString() == s1);
//System.out.println(sb1.toString().equals(s1));
}