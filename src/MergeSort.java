public class MergeSort {
    void merge(int[] arr,int l,int r,int m) {
        int size1 = m - l + 1;
        int size2 = r - m;

        int L[] = new int[size1];
        int R[] = new int[size2];
        for (int i = 0; i < size1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < size2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;

        while (i <= size1 && j <= size2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
            } else {
                arr[k] = R[j];
            }
            k++;
        }
        while (i < size1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < size2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void print(int[] arr){
            for (int p=0;p<arr.length;p++){
                System.out.println(""+arr[p]);
            }
        }

    void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            int m =(l+ r)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, r, m);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        print(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        print(arr);
    }
}