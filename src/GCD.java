public class GCD {
    static int count(int a,int b){
        if (b==0){
            return a;
        }
        return count(a,a%b);
    }
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + count(a, b));
    }
}