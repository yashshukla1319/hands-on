import java.io.PrintStream;
import java.util.Scanner;

public class std {
    private static PrintStream StdOut;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count=1;
        String op;
        while(sc.hasNext()){

            for(int i=1;i<=count;i++){
                count++;
                op= sc.nextLine();
                StdOut.println(i+" "+op);
            }
        }
    }
}

