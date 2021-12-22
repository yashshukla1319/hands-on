public class VovelnConsonent {
    public static void main(String[] args){
        String str="yash";

        char[] strchar = str.toCharArray();
        char[] arr = {'a','e','i','o','u'};
        int i=0,j=0,vovel=0;
        int cons=0;
        while (i< arr.length) {
            while (j < strchar.length) {
                if (strchar[j] == arr[i]){
                    vovel++;
                }
                else {
                    cons++;
                }
                j++;
            }
            i++;
        }
        System.out.println("No.of Vovels: "+vovel);
        System.out.println("No.of Consonents: "+cons);
    }
}
