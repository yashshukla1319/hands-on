import java.util.regex.Pattern;

// To check whether a string contains only numbers
public class CheckString {
    public static void main(String[] args){
        String matcher = "//d";//.*[0-9].*
        //Pattern pattern = Pattern.compile(matcher);
        String val = "12345";
        System.out.println(Pattern.matches(matcher,val));
    }
}
