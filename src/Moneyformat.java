import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Moneyformat {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String u = numberFormat.format(money);
        System.out.println("US: "+numberFormat.format(money));
        //numberFormat.setCurrency(Currency.getInstance(Locale.getDefault()));
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en","India"));
        System.out.println("INDIA: "+n2.format(money));
        //numberFormat.setCurrency(Currency.getInstance(Locale.CHINA));

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("CHINA: "+n3.format(money));
        //numberFormat.setCurrency(Currency.getInstance(Locale.FRANCE));

        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("FRANCE: "+n4.format(money));

    }
}
