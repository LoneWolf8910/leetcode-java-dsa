// You are given a 1-indexed array of integers numbers that is already sorted in non-decreasing order.

// Find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

// Return the indices of the two numbers index1 and index2 as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

 

// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
// Example 3:

// Input: numbers = [-1,0], target = -1
// Output: [1,2]
// Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


// Better use two pointers here.....This was just to practice hashmap 
import java.util.HashMap;
public class Two_Sum_sorted_array {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.getOrDefault(complement, null) + 1, i + 1 };
            } else
                map.put(numbers[i], i);
        }

        return new int[] { -1, -1 };
    }
}



/*
 * ============================================================
 * Problem: Two Sum II - Input Array Is Sorted
 * Platform: LeetCode
 * Problem Number: 167
 * Difficulty: Medium
 * Topic: Arrays / Hash Table
 * Pattern: Complement Lookup using HashMap
 *
 * Approach:
 * 1. Create a HashMap to store previously visited numbers
 * as keys and their 0-based indices as values.
 * 2. Traverse the array from left to right.
 * 3. For each number, calculate its complement:
 * complement = target - numbers[i]
 * 4. Check whether the complement already exists in the map.
 * 5. If it exists, return the stored index of the complement
 * and the current index, converting both to 1-based indices
 * as required by LeetCode.
 * 6. Otherwise, store the current number and its index.
 * 7. Return [-1, -1] as a fallback if no pair is found.
 *
 * Why HashMap?
 * It provides average O(1) lookup and insertion, allowing
 * us to find the complement without searching the entire array.
 *
 * Time Complexity: O(n) average
 * - Each array element is processed at most once.
 * - HashMap lookup and insertion take O(1) average time.
 *
 * Space Complexity: O(n)
 * - In the worst case, the map stores up to n distinct numbers.
 *
 * Key Idea:
 * Instead of searching for two numbers directly, calculate
 * the complement needed to reach the target and check whether
 * it has already been encountered.
 *
 * Important:
 * LeetCode 167 requires 1-based indices, so add 1 to each
 * stored or current index before returning.
 *
 * ============================================================
 */
