public class SelectionSort {
    void sort(int[] ar){
        for (int i=0;i<ar.length-1;i++){
            int min=i;
            for (int j=i+1;j<ar.length;j++){
                if (ar[j]<ar[min]){
                    min =j;
                    int temp = ar[min];
                    ar[min] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        for (int j=0;j<ar.length;j++){
            System.out.print(ar[j]+" ");
            System.out.println();
            }
        }
    public static void main(String[] args)
    {
        SelectionSort ob = new SelectionSort();
        int[] arr = {64,25,12,22,11};
        System.out.println("Sorted array");
        ob.sort(arr);
    }
}

