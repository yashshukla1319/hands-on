public class fibbo {
    public static int fibonnaci(int n){
        int a=0,b=1,c;
        if (n==0){
            return a;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] arg){
        System.out.println(fibonnaci(9));
    }
}
