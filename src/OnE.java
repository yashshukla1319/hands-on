// Find whether number is odd or even without using arithmetic operators
public class OnE {
    public static void main(String[] arg){
        int num = 53;
        if ((num & 1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
