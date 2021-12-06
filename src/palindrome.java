import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        //int length = A.length();
        String B="";
        for ( int i =A.length()- 1; i >= 0; i-- ) {
            B = B+A.charAt(i);
        }
        if (A.equals(B)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}

