import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        String str1 = "daad";
        // create object for scanner class
//        sc = new Scanner(System.in);
//        if (sc != null) {
//            System.out.println("Enter First String");
//            str1 = sc.nextLine();
//        }
        strPalindrom(str1);
    }// main

    static void strPalindrom(String str) {
        // converting string into array
        char ch[] = str.toCharArray();
        // check string is Palindrom or not
        int count = ch.length - 1;
        for (int i = 0; i < ch.length; i++, count--) {
            if (ch[i] != ch[count]) {
                System.out.println("String is not Palindrom");
                break;
            } else {
                if (i == count) {
                    System.out.println("i: "+i+" "+"count: "+count);
                    System.out.println("String is Palindrom");
                }
            }
        } // for
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        //int length = A.length();
//        String B="";
//        for ( int i =A.length()- 1; i >= 0; i-- ) {
//            B = B+A.charAt(i);
//        }
//        if (A.equals(B)) {
//            System.out.print("Yes");
//        } else {
//            System.out.print("No");
//        }
//    }
    }
}

