// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

 

// Constraints:

//     2 <= nums.length <= 104
//     -109 <= nums[i] <= 109
//     -109 <= target <= 109
//     Only one valid answer exists.

 
// Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

//O)n2)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
                
            }
        }
        return new int[] {-1, -1};
    }
}



/*
 * ============================================================
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Arrays
 * Pattern: Brute Force
 *
 * Approach:
 * We use two nested loops.
 *
 * The first loop selects nums[i].
 * The second loop checks every element after nums[i].
 *
 * If nums[i] + nums[j] == target, we return their indices.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Why O(n²)?
 * In the worst case, we may have to compare almost every
 * pair of elements in the array.
 *
 * Why O(1) space?
 * We don't use any additional data structure that grows
 * with the input size.
 *
 * Note:
 * This is the brute-force solution.
 * An O(n) solution can be achieved using a HashMap.
 * ============================================================
 */
