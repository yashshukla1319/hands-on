import java.util.regex.Pattern;

// To check whether a string contains only numbers
public class CheckString {
    public static void main(String[] args){
        //String matcher = "//d";//.*[0-9].*
        String matcher = "//.*[0-9].*";
        //Pattern pattern = Pattern.compile(matcher);
        String val = "123";
        StringBuilder sb = new StringBuilder(val);// + val;
        sb.append(val);
        System.out.println(Pattern.matches(matcher,val));
    }
}
