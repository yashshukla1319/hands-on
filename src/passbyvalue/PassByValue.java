package passbyvalue;

public class PassByValue {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Before: " + x);
        x = 20;
        changeValue(x);
        System.out.println("After: " + x);

    }

    public static void changeValue(int arr) {
        arr = 20;
        System.out.println("Arr: "+arr);
    }
        //Arrays.stream(arr).collect();
}
