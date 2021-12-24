// Add two numbers without using plus operator
public class Add {
    int carry;
    public void add(int num1, int num2) {
        while (num2 != 0) {
            carry = (num1 & num2);
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        System.out.println(num1);
    }
    public static void main(String[] arg) {
        Add add = new Add();
        add.add(54,20);
    }
}
