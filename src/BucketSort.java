import java.util.Collections;
import java.util.Vector;

public class BucketSort {
    public static void main(String[] args){
        Vector<Float> bucket = new Vector<>();
        bucket.add((float) 0.12);
        bucket.add(0.5F);
        bucket.add((float) 0.11);
        bucket.add((float) 1.8);
        bucket.add((float) 1.1);
        Collections.sort(bucket);
        System.out.println(bucket);
    }
}
