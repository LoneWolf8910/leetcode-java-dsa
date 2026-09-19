// You are given an integer array nums of length n and an integer target.

// Find three integers at distinct indices in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

 

// Constraints:

//     3 <= n <= 500
//     -1000 <= nums[i] <= 1000
//     -104 <= target <= 104

//Brute Force Approach... O(n^3) time complexity and O(1) space complexity
// class Sum3closest {
//     public int threeSumClosest(int[] nums, int target) {
        
        
//         return 0;
//     }
// }


//Two Pointer Approach... O(n^2) time complexity and O(1) space complexity
import java.util.Arrays;
class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        
        //Sorting the array
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        //Using Two Pointer Approach        
        for(int i = 0; i < n - 2; i++){
            int first = i;
            int last = n - 1;
            int second = first + 1;
            

            while (second < last ) {
                int sum = nums[first] + nums[second] + nums[last];
                if (sum == target) {
                    closestSum = sum;
                }

                if(Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if(sum < target) {
                    second++;
                }

                else {
                    last --;
                }
                
            }

        }

        return closestSum;
        
    }
}

/*
 * ============================================================
 * Problem: 3Sum Closest
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Arrays
 * Pattern: Sorting + Two Pointers
 *
 * Approach:
 * First, we sort the array so that we can efficiently use
 * the two-pointer technique.
 *
 * We fix one element using a loop and then use two pointers:
 * one starting just after the fixed element and one at the
 * end of the array.
 *
 * We calculate the current three-element sum and compare its
 * difference from the target with the closest sum found so far.
 *
 * If the current sum is closer to the target, we update the
 * closest sum.
 *
 * If the current sum is smaller than the target, we move the
 * left pointer to the right to increase the sum.
 *
 * If the current sum is larger than the target, we move the
 * right pointer to the left to decrease the sum.
 *
 * If the current sum equals the target, we have found the
 * exact answer and can return it immediately.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)*
 *
 * Why O(n²)?
 * Sorting takes O(n log n), and after sorting we use an outer
 * loop with a two-pointer traversal, resulting in O(n²) time.
 * Since O(n²) dominates O(n log n), the overall complexity
 * is O(n²).
 *
 * Why O(1) space?
 * We use only a constant number of variables and pointers
 * apart from the sorting implementation.
 *
 * This optimized approach is much faster than checking every
 * possible combination of three elements using three nested
 * loops, which would take O(n³) time.
 *
 * ============================================================
 */