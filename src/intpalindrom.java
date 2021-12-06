public class intpalindrom {
    public static void main(String[] args) {
        int r,c=0;
        int num = 123;
        int temp = 0;
        while (num > 0) {
            r = num % 10;
            c = (c * 10) + r;
            temp = r / 10;
            num = temp;
        }

        if (num ==temp) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
/*
    public class MyClass {
    public static void main(String args[]) {
      int c=121;
      String s= Integer.toString(c);
      StringBuilder sb = new StringBuilder(s);
      String  cmp = sb.reverse().toString();
      System.out.println(cmp);
      if(s.equals(cmp)){
          System.out.println("True");
      }
      else{
        System.out.println("False");
      }
    }
}
 */