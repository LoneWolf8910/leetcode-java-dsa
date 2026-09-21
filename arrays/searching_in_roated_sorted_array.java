// There is an integer array nums sorted in ascending order(with distinct values).

// Prior to being passed to your function,nums is possibly left rotated at an unknown index k(1<=k<nums.length)such that the resulting array is[nums[k],nums[k+1],...,nums[n-1],nums[0],nums[1],...,nums[k-1]](0-indexed).For example,[0,1,2,4,5,6,7]might be left rotated by 3 indices and become[4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target,return the index of target if it is in nums,or-1 if it is not in nums.

// You must write an algorithm with O(log n)runtime complexity.

// Example 1:

// Input:nums=[4,5,6,7,0,1,2],target=0 Output:4

// Example 2:

// Input:nums=[4,5,6,7,0,1,2],target=3 Output:-1

// Example 3:

// Input:nums=[1],target=0 Output:-1

// Constraints:

// 1<=nums.length<=5000-104<=nums[i]<=104 All values of nums are unique.nums is an ascending array that is possibly rotated.-104<=target<=104

//TWO POINTER APPROACH
public class searching_in_roated_sorted_array {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[left] == target) {
                return left;
            }
            left++;
            if (nums[right] == target) {
                return right;
            }
            right--;
        }

        return -1;
    }
}

/*
 * ============================================================
 * Problem: Search in Rotated Sorted Array
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Arrays
 * Pattern: Two Pointers
 *
 * Approach:
 * We use two pointers, one at the beginning of the array and
 * one at the end of the array.
 *
 * We check the element at the left pointer and the element at
 * the right pointer for the target.
 *
 * If the target is found at either pointer, we immediately
 * return its index.
 *
 * If the target is not found, we move the left pointer one
 * position to the right and the right pointer one position
 * to the left.
 *
 * We continue this process until the two pointers cross.
 *
 * If the target is not found after checking the entire array,
 * we return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Why O(n)?
 * In the worst case, we may need to check every element in
 * the array before determining that the target does not exist.
 *
 * Since the left and right pointers move toward each other,
 * each element is checked at most once.
 *
 * Why O(1) space?
 * We only use a constant number of variables (left, right,
 * n, and temporary values), without creating any additional
 * data structures.
 *
 * Note:
 * This solution uses a two-pointer traversal. The standard
 * optimized solution for this problem uses binary search and
 * achieves O(log n) time by taking advantage of the sorted
 * portions of the rotated array.
 *
 * ============================================================
 */