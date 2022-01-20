import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "This is a string";
        String ans = "";
        String[] ar = str.split(" ");
        //ArrayList<String> list = (ArrayList<String>) Arrays.asList(str.split("//s"));
        for (int i = ar.length-1; i >=0; i--) {
            //list.add(str.split("//s"));
            ans += ar[i] + " ";
        }
        System.out.println(ans);//ans.substring(0, ans.length() - 1));

        StringBuilder sb = new StringBuilder(str);
    }
}
