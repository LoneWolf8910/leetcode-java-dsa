// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
// The input is generated such that a majority element will exist in the array.
 

// Follow-up: Could you solve the problem in linear time and in O(1) space?

import java.util.*;

public class majority_element {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int m = n / 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }

        for (int key : map.keySet()) {
            if (map.get(key)> m) {
                return key;
            }
        }

        return -1;
    }
}


/*
 * ============================================================
 * Problem: Majority Element
 * Platform: LeetCode
 * Problem Number: 169
 * Difficulty: Easy
 * Topic: Arrays / Hash Table
 * Pattern: Frequency Counting using HashMap
 *
 * Approach:
 * 1. Calculate n, the length of the array, and m = n / 2.
 * 2. Create a HashMap where:
 * - Key = array element
 * - Value = frequency of that element.
 * 3. Traverse the array:
 * - If the element already exists in the map, increment
 * its frequency by 1.
 * - Otherwise, insert it with an initial frequency of 1.
 * 4. Iterate through the keys of the HashMap.
 * 5. If any element has a frequency greater than n / 2,
 * return that element as the majority element.
 * 6. Return -1 as a fallback if no majority element is found.
 *
 * Why HashMap?
 * It stores each distinct element and its frequency, allowing
 * average O(1) lookup and update operations.
 *
 * Time Complexity: O(n) average
 * - Building the frequency map takes O(n) average time.
 * - Checking the map's keys takes O(k), where k is the
 * number of distinct elements.
 * - Since k <= n, the overall time complexity is O(n)
 * on average.
 *
 * Space Complexity: O(k), worst case O(n)
 * - The map stores k distinct elements and their frequencies.
 * - If all elements are distinct, it stores n entries.
 *
 * Key Idea:
 * A majority element appears strictly more than n / 2 times.
 * Count each element's frequency and return the element that
 * satisfies this condition.
 *
 * ============================================================
 */
