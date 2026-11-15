// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000
 

// Constraints:

// n == nums.length
// 1 <= k <= n <= 105
// -104 <= nums[i] <= 104

public class max_avg_subarray {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxavg = 0;
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avg = sum / k;
        maxavg = avg;
        for (int right = k; right < nums.length; right++) {
            sum = sum - nums[right - k];
            sum += nums[right];
            avg = sum / k;

            maxavg = Math.max(maxavg, avg);

        }
        return maxavg;
    }
}

/*
 * ============================================================
 * Problem: Maximum Average Subarray I
 * Platform: LeetCode
 * Problem Number: 643
 * Difficulty: Easy
 * Topic: Array
 * Pattern: Fixed Size Sliding Window
 *
 * Approach:
 * 1. Initialize sum = 0 to calculate the sum of the
 * first window of size k.
 *
 * 2. Traverse the first k elements and add each element
 * to sum.
 *
 * 3. Calculate the average of the first window using:
 * avg = sum / k.
 *
 * 4. Initialize maxavg with the first window's average
 * instead of zero, ensuring correct results even when
 * all array elements are negative.
 *
 * 5. Start the sliding window traversal from right = k,
 * since the first window has already been calculated.
 *
 * 6. For each new window:
 * - Remove the outgoing element using nums[right - k].
 * - Add the incoming element using nums[right].
 * - Calculate the current average by dividing sum by k.
 *
 * 7. Update maxavg using Math.max() to maintain the
 * maximum average found so far.
 *
 * 8. After processing all possible windows, return maxavg.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Idea:
 * Instead of recalculating the sum of every subarray,
 * maintain a fixed-size window of k elements.
 * Remove the element leaving the window and add the
 * incoming element to calculate the next window's sum
 * efficiently.
 *
 * Important:
 * Initialize maxavg with the first window's average,
 * not zero, because the array may contain negative values.
 * ============================================================
 */