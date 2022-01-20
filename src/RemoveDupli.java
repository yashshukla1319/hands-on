import java.util.Arrays;

public class RemoveDupli {
    public static void main(String[] arg) {
        int[] arr = {1, 3, 2, 1, 4, 3};
        int n = arr.length;;
        int[] nodupli = new int[6];
        int i=0,j=0;
        Arrays.sort(arr);
        while (i < nodupli.length) {
            int a = arr[i],b = arr[i+1];
                if (a != b) {
                    nodupli[++j] = a;
                }
                i++;
        }
        for (i=0;i< nodupli.length;i++) {
            System.out.println(+nodupli[i]);
        }
    }
}
