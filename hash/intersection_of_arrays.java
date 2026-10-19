// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

import java.util.HashMap;
import java.util.HashSet;

public class intersection_of_arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int nums : nums1) {
            set.add(nums);
        }

        for (int nums : nums2) {
            if (set.contains(nums)) {
                result.add(nums);
            }
        }
        int i = 0;
        int[] answer = new int[result.size()];
        for (int num : result)
            answer[i++] = num;


        return answer;

    }
}
