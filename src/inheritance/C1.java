package inheritance;


public class C1 implements I1, I2{
    public static void main(String[] args)
    {
        System.out.println(new C1().getGreeting());
    }

    @Override
    public String getGreeting() {
        return I1.super.getGreeting();
    }
}
