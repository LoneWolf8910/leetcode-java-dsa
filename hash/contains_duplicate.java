// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 
// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

// Example 2:

// Input: nums = [1,2,3,4]

// Output: false

// Explanation:

// All elements are distinct.

// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]

// Output: true

 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

import java.util.*;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        // boolean isDuplicate = false;......this is a junk variable, this will just increase the time of execution.
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], 1);
        }

        return false;
    }
}

/*
 * ============================================================
 * Problem: Contains Duplicate
 * Platform: LeetCode
 * Problem Number: 217
 * Difficulty: Easy
 * Topic: Hash Table / Arrays
 * Pattern: HashMap Lookup
 *
 * Approach:
 * 1. Create a HashMap to store the elements encountered so far.
 * 2. Traverse the array from left to right.
 * 3. For each element, check whether it already exists in the map.
 * 4. If it exists, a duplicate has been found, so return true.
 * 5. Otherwise, insert the element into the map.
 * 6. If the entire array is traversed without finding a duplicate,
 * return false.
 *
 * Why HashMap?
 * HashMap allows us to check whether an element has been seen
 * before in average O(1) time.
 *
 * Time Complexity: O(n) average
 * - We traverse the array at most once.
 * - Each HashMap lookup and insertion takes O(1) average time.
 *
 * Space Complexity: O(n)
 * - In the worst case, all elements are distinct, so the map
 * stores all n elements.
 *
 * Key Idea:
 * Detect duplicates by remembering previously encountered
 * elements and checking each new element against them.
 *
 * Note:
 * The boolean variable isDuplicate is unnecessary because
 * the method can return true immediately when a duplicate
 * is found and false after the loop finishes.
 *
 * ============================================================
 */
