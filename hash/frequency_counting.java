
import java.util.*;
public class frequency_counting {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,2};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);
    }
}
