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

public class Two_Sum_sorted_array {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else
                left++;
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
 * Topic: Arrays
 * Pattern: Two Pointers
 *
 * Approach:
 * 1. Initialize two pointers:
 * - left = 0, pointing to the first element.
 * - right = n - 1, pointing to the last element.
 * 2. Calculate the sum of the elements at both pointers.
 * 3. If the sum equals the target, return their 1-based indices.
 * 4. If the sum is greater than the target, decrement right
 * to obtain a smaller sum.
 * 5. If the sum is less than the target, increment left
 * to obtain a larger sum.
 * 6. Repeat until the pointers meet or cross.
 * 7. Return [-1, -1] as a fallback if no valid pair is found.
 *
 * Why Two Pointers?
 * The array is sorted in ascending order.
 * Moving the left pointer right increases the potential sum,
 * while moving the right pointer left decreases it.
 * This eliminates the need to check every possible pair.
 *
 * Time Complexity: O(n)
 * - Each iteration moves either the left or right pointer
 * inward by one position.
 * - Each pointer moves at most n positions.
 *
 * Space Complexity: O(1)
 * - Only a constant number of variables are used.
 * - No additional data structure is required.
 *
 * Key Idea:
 * Use the sorted order to adjust the sum efficiently by
 * moving the appropriate pointer instead of using nested loops.
 *
 * Important:
 * LeetCode 167 requires 1-based indices, so return left + 1
 * and right + 1 rather than the original array indices.
 *
 * ============================================================
 */
