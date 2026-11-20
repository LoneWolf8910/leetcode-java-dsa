// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//**(This certainly means that the number has a duplicate at two indices and the difference between the two iundices is basically less than of equal to k)
 

// Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
// 0 <= k <= 105

import java.util.HashSet;

public class contains_duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l= nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}


/*
 * ============================================================
 * Problem: Contains Duplicate II
 * Platform: LeetCode
 * Problem Number: 219
 * Difficulty: Easy
 * Topic: Array, HashSet
 * Pattern: Sliding Window + HashSet
 *
 * Approach:
 * 1. Initialize a HashSet to store the elements currently
 * present in the sliding window.
 *
 * 2. Traverse the array using a for loop with index i.
 *
 * 3. Check whether the current element already exists
 * in the HashSet using contains().
 * - If it exists, return true because a duplicate
 * has been found within the allowed index distance.
 *
 * 4. If the element does not exist, add it to the HashSet
 * using add().
 *
 * 5. Check whether the HashSet size exceeds k.
 * - If set.size() > k, remove nums[i - k].
 * - This removes the element that is leaving the
 * allowed sliding window.
 *
 * 6. Continue until the entire array has been traversed.
 *
 * 7. If no valid duplicate is found, return false.
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(min(n, k))
 *
 * Key Idea:
 * Maintain a sliding window containing at most k previous
 * elements using a HashSet. Before adding each new element,
 * check whether it already exists in the window. If it does,
 * a nearby duplicate has been found.
 *
 * Important:
 * The duplicate check must happen before removing the
 * outgoing element so that duplicates exactly k positions
 * apart are also detected.
 * ============================================================
 */