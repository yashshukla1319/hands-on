public class prime {
    public static void main(String [] args) {
        int x =5;
        int i=1;
        while (i<x){
            if(x % i == 0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
            i++;
        }
    }
}