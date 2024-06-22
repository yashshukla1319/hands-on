package passbyvalue;

public class PrintNumRecursion {
    public static void main(String[] args) {
        int x = 10;

        int[] arr = new int[5];
        int size = arr.length;
        System.out.println("Size: "+size);
        System.out.println(arr[4]);

        printNum(1);
        //System.out.println("After: " + x);

    }

    public static void printNum(int arr) {
        if (arr < 5){
            System.out.println("Number: "+arr);
            printNum(arr+1);
        }
    }
}
