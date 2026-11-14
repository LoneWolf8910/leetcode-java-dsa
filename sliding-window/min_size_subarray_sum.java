// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0
 

// Constraints:

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 104
 

// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).


public class min_size_subarray_sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum =0;
        int minlength = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minlength = Math.min(minlength, (right - left + 1));
                sum -= nums[left];
                left++;
            }
        }

        if (minlength > nums.length)
            return 0;
        else
            return minlength;
    }
}


/*
 * ============================================================
 * Problem: Minimum Size Subarray Sum
 * Platform: LeetCode
 * Problem Number: 209
 * Difficulty: Medium
 * Topic: Array, Sliding Window
 * Pattern: Variable Size Sliding Window
 *
 * Approach:
 * 1. Initialize two pointers:
 * - left = 0 (starting position of the window).
 * - right = 0 (ending position of the window).
 *
 * 2. Initialize sum = 0 to maintain the sum of the current
 * sliding window.
 *
 * 3. Initialize minlength = Integer.MAX_VALUE to store
 * the minimum valid subarray length found so far.
 *
 * 4. Expand the window by moving the right pointer through
 * the array and adding nums[right] to the current sum.
 *
 * 5. Whenever sum >= target:
 * - Calculate the current window length using
 * (right - left + 1).
 * - Update minlength using Math.min().
 * - Shrink the window by subtracting nums[left]
 * from the current sum.
 * - Move the left pointer forward.
 *
 * 6. Continue shrinking while the current sum remains
 * greater than or equal to the target. This helps find
 * the smallest valid window ending at the current right.
 *
 * 7. After traversing the array:
 * - If no valid subarray was found, return 0.
 * - Otherwise, return minlength.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Idea:
 * Expand the window using the right pointer until its sum
 * reaches the target. Then shrink it using the left pointer
 * while maintaining a valid sum, updating the minimum
 * subarray length along the way.
 *
 * Important:
 * This sliding window approach works because the array
 * contains positive integers. Removing an element from
 * the left decreases the window sum.
 * ============================================================
 */