public class MyClass {
    public static void main(String args[]) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        nextGreaterElement(nums1, nums2);
    }

    public static void nextGreaterElement(int[] nums1, int[] nums2) {
        int[] finalArray = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if ( nums1[i] == nums2[j]) {
                    if (/*j != nums2.length-1 &&*/ nums2[j + 1] > nums2[j]) {
                        finalArray[i] = nums2[j + 1];
                    } else {
                        finalArray[i] = -1;
                    }
                }
            }
        }
        for (int k = 0; k < finalArray.length; k++) {
            System.out.println("Elements: " + finalArray[k]);
        }
    }
}