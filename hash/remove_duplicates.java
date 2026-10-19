
import java.util.HashSet;

public class remove_duplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        System.out.println(set);
        return 0;
    }
}
