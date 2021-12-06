import java.util.Scanner;

public class StringPattern1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        StringBuffer sba = new StringBuffer();
        StringBuffer sbb = new StringBuffer();


        int counta=A.length();
        int countb=B.length();

        int total=counta+countb;
        System.out.println(total);

        char a=A.charAt(0);
        String ca = String.valueOf(a);
        //System.out.println(a);
        char b=B.charAt(0);
        String cb = String.valueOf(b);
        //System.out.println(b);

        if(b<a){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        int i=0;
        while (i<A.length()) {

            if (i==0) {
                sba.append(Character.toUpperCase(A.charAt(i)));
            }
                else {
                sba.append(A.charAt(i));
            }
                i++;
        }


        i = 0;
        while(i<B.length()) {

            if(i==0) {
                sbb.append(Character.toUpperCase(B.charAt(i)));
            }
            else{
                sbb.append(B.charAt(i));
            }
            i++;
        }

        //char aftera=Character.toUpperCase(a);
        //char afterb=Character.toUpperCase(b);

        //A.replaceAll(ca, String.valueOf(aftera));
        //B.replaceAll(cb, String.valueOf(afterb));
        System.out.println(sba+" "+sbb);


    }
}
