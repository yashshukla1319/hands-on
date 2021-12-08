public class BinarySearch {
    public static void search(int[] arr,int first,int last,int key) {
        int mid = (first + last) / 2;
        while (first<=last) {
            if (key > arr[mid]) {
                first = mid + 1;
            }
            else if (arr[mid] == key){
                System.out.println("Found the element at index: "+mid);
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (first+last)/2;
        }
        if (first>last){
            System.out.println("Not found");
        }
    }
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};
        search(ar,1,5,3);
    }
}
