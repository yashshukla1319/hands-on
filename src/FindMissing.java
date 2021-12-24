public class FindMissing {
    public static void main(String[] arg){
        int[] arr = {1,3,4,5};
        int cntr=0;
        for (int i=arr[0];i<arr.length-1;i++){
                if (arr[cntr]==i){
                    cntr++;
                }
                else {
                    System.out.println("Missing: "+i);
                }
            }
        }
}
