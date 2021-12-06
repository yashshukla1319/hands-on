public class bubblesort {

    public void swap(int a, int b) {


    }
    public static void main(String[] args){
        int temp;
        bubblesort bs = new bubblesort();
        int[] arr = {5,3,7,1,9,4,2,8,6};
        for(int j=0;j<arr.length;j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
