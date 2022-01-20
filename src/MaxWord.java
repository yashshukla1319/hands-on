import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Find max repeated word from a file.
public class MaxWord {
    int max = 1;
    HashMap<String,Integer> hashMap = new HashMap<>();
    public void getMax() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/Yash.Shukla/Desktop/link.txt"));
        while (sc.hasNext()){
            String word = sc.next();
            if (hashMap.containsKey(word)){
                hashMap.put(word,hashMap.get(word)+1);
            }
            else {
                int cnt = 1;
                hashMap.put(word,cnt);
            }
        }

        for (Map.Entry<String,Integer> mp: hashMap.entrySet()){
            //max = 1;
            if (mp.getValue()>max){
                max = mp.getValue();
            }
            //System.out.println("Key: "+mp.getKey()+"Value: "+mp.getValue());
        }
    }
    public void printMax(){
        for (Map.Entry<String,Integer> mp: hashMap.entrySet()) {
            if (mp.getValue() == max) {
                System.out.println(mp);
            }
        }
    }
    public static void main(String[] arg) throws FileNotFoundException {
        MaxWord mx = new MaxWord();
        mx.getMax();
        mx.printMax();
    }
}
