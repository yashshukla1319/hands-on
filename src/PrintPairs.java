// Print pairs whose sum is equal to the given sum
public class PrintPairs {
    public static void main(String[] arg){
        int sum=5,first,second;
        int[] ar1 ={1,2,3,4,5,6,7};
        for (int i=0;i< ar1.length;i++){
            first = ar1[i];
            for (int j=i+1;j< ar1.length;j++){
                second = ar1[j];
                if (first+second==sum){
                    System.out.println("The pair is("+first+","+second+")");
                }
            }
        }
    }
}
