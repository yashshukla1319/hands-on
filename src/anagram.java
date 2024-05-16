import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static boolean isAnagram(String a, String b) {
        char[] arrayS1 = a.toLowerCase().toCharArray();
        char[] arrayS2 = b.toLowerCase().toCharArray();
        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);
        boolean status = Arrays.equals(arrayS1, arrayS2);

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
