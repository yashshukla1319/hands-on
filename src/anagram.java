import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static boolean isAnagram(String a, String b) {
        char[] ArrayS1 = a.toLowerCase().toCharArray();
        char[] ArrayS2 = b.toLowerCase().toCharArray();
        Arrays.sort(ArrayS1);
        Arrays.sort(ArrayS2);
        boolean status = Arrays.equals(ArrayS1, ArrayS2);

        return status;
    }


public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        scan.close();
        boolean ret=isAnagram(a,b);
        System.out.println((ret)?"Anagrams":"Not Anagrams");
        }
}
