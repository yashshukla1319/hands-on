public class Floyds {
    public static void main(String[] arg){
        int val=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print(val);
                val++;
            }
            System.out.println("");
        }
    }
}
