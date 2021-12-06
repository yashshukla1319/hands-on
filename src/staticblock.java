import java.util.Scanner;

public class staticblock {
    public static boolean flag= true;
    public static int B;
    public static int H;
    static {

        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            flag=false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
        //flag = false;
    }


        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }//end of main

    }

