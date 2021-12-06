public class reverse {
    public static void main(String[] args) {
        String str = "Hii this is yash";
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        /*String check = "";
        for(int i=str.length()-1;i>=0;i--){
            check = check+str.charAt(i);
        }*/
        System.out.println(sb);
    }
}
/*
String str = "Hii this is yash";
StringBuilder sb = new StringBuilder(str);
sb = sb.reverse();

char chararray[] = str.toCharArray();
for(int i=str.length()-1;i>=;--){
S.o.p(str)
}
 */