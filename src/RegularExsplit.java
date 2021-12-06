import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RegularExsplit {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int counter=0;
            // Write your code here.

            if(!sc.hasNext()){
                System.out.println(0);
            }
            else{
                String s = sc.nextLine();
                String[]a = s.split("[ !,?._'@]+");

                ArrayList<String> lists = new ArrayList<String>(Arrays.asList(a));
                System.out.println(lists.size());
                for(String op: lists){
                    System.out.println(op);
                }
                sc.close();
            }
        }
    }


