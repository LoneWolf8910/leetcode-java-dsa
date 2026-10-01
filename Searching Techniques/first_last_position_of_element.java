// Given an array of integers nums sorted in non-decreasing order,find the starting and ending position of a given target value.

// If target is not found in the array,return[-1,-1].

// You must write an algorithm with O(log n)runtime complexity.

// Example 1:

// Input:nums=[5,7,7,8,8,10],target=8 Output:[3,4]Example 2:

// Input:nums=[5,7,7,8,8,10],target=6 Output:[-1,-1]Example 3:

// Input:nums=[],target=0 Output:[-1,-1]

// Constraints:

// 0<=nums.length<=105-109<=nums[i]<=109 nums is a non-decreasing array.-109<=target<=109

public class first_last_position_of_element {
    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int first = -1;
        int last = -1;
        int left = 0;
        int right = n - 1;
        // Finding the first occurrence of the target value
        while (left <= right) {

            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                first = mid;
                last = mid;

                right = mid - 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        left = 0;
        right = n - 1;
        // Finding the last occurrence of the target value
        while (left <= right) {

            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                last = mid;

                left = mid + 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return new int[] { first, last };
    }
}

/*
 * ============================================================
 * Problem: Find First and Last Position of Element in Sorted Array
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Binary Search
 * Pattern: Modified Binary Search / Boundary Search
 *
 * Approach:
 * We are given a sorted array and need to find the starting
 * and ending position of a given target value.
 *
 * Instead of using a normal binary search that stops as soon
 * as the target is found, we perform binary search twice.
 *
 * First Binary Search:
 * We search for the FIRST occurrence of the target.
 *
 * When nums[mid] == target, we store mid as a possible answer
 * and continue searching towards the LEFT by moving:
 *
 * right = mid - 1
 *
 * This allows us to find whether another occurrence of the
 * target exists before the current position.
 *
 * Second Binary Search:
 * We search for the LAST occurrence of the target.
 *
 * When nums[mid] == target, we store mid as a possible answer
 * and continue searching towards the RIGHT by moving:
 *
 * left = mid + 1
 *
 * This allows us to find whether another occurrence of the
 * target exists after the current position.
 *
 * If the target does not exist, both first and last remain -1.
 *
 * Finally, we return:
 *
 * {first, last}
 *
 * Example:
 *
 * nums = [5,7,7,8,8,10]
 * target = 8
 *
 * First occurrence = 3
 * Last occurrence = 4
 *
 * Result = [3,4]
 *
 * Time Complexity: O(log n)
 *
 * Why O(log n)?
 * We perform binary search twice.
 *
 * First binary search -> O(log n)
 * Second binary search -> O(log n)
 *
 * Therefore:
 *
 * O(log n) + O(log n) = O(log n)
 *
 * Space Complexity: O(1)
 *
 * Why O(1) space?
 * We only use a constant number of variables such as
 * left, right, mid, first, and last.
 *
 * Important Concept:
 * This problem demonstrates how normal binary search can be
 * modified to find boundaries instead of simply finding
 * whether an element exists.
 *
 * For FIRST occurrence:
 *
 * target found
 * ↓
 * save mid
 * ↓
 * search LEFT
 *
 * For LAST occurrence:
 *
 * target found
 * ↓
 * save mid
 * ↓
 * search RIGHT
 *
 * This boundary-search technique is useful for many variations
 * of binary search problems.
 *
 * ============================================================
 */