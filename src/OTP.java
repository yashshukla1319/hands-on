import java.util.stream.Stream;

public class OTP {
    public static void main(String[] args) {
        int x = (int) (Math.random()*99999);
        System.out.println("After: " + x);

        Stream.of("9879878971", "7657659870").forEach(s -> {
            System.out.println(s.replaceAll(".(?=.{2})", "#"));
    });

    }
}
