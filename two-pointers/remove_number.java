// Given an integer array nums and an integer val,remove all occurrences of val in nums in-place.The order of the elements may be changed.Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k,to get accepted,you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val.The remaining elements of nums are not important as well as the size of nums.Return k.

// Custom Judge:

// The judge will test your solution with the following code:

// int[]nums=[...]; // Input array
// int val=...; // Value to remove
// int[]expectedNums=[...]; // The expected answer with correct length.
//                          // It is sorted with no values equaling val.

// int k=removeElement(nums,val); // Calls your implementation

// assert k==expectedNums.length;sort(nums,0,k); // Sort the first k elements of nums
// for(int i=0;i<actualLength;i++){assert nums[i]==expectedNums[i];}

// If all assertions pass,then your solution will be accepted.

// Example 1:

// Input:nums=[3,2,2,3],val=3 Output:2,nums=[2,2,_,_]Explanation:Your function should return k=2,with the first two elements of nums being 2. It does not matter what you leave beyond the returned k(hence they are underscores).

// Example 2:

// Input:nums=[0,1,2,2,3,0,4,2],val=2 Output:5,nums=[0,1,4,0,3,_,_,_]Explanation:Your function should return k=5,with the first five elements of nums containing 0,0,1,3,and 4. Note that the five elements can be returned in any order.It does not matter what you leave beyond the returned k(hence they are underscores).

// Constraints:

// 0<=nums.length<=100 0<=nums[i]<=50 0<=val<=100

// TWO POINTER APPROACH
public class remove_number {
    public int removeElement(int[] nums, int val) {

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            } else
                continue;
        }
        return pos;
    }
}

/*
 * ============================================================
 * Problem: Remove Element
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Arrays
 * Pattern: Two Pointers
 *
 * Approach:
 * We need to remove all occurrences of a given value `val`
 * from the array in-place.
 *
 * We use two pointers:
 *
 * 1. i:
 * Scans through every element of the array.
 *
 * 2. pos:
 * Keeps track of the position where the next element that
 * is NOT equal to `val` should be placed.
 *
 * We start `pos` at index 0.
 *
 * For every element nums[i], we check whether it is equal to
 * `val`.
 *
 * If nums[i] is NOT equal to val, it is a valid element that
 * should remain in the array.
 *
 * We place it at the current `pos` position:
 *
 * nums[pos] = nums[i]
 *
 * Then we move `pos` forward:
 *
 * pos++
 *
 * If nums[i] is equal to val, we simply ignore it and continue
 * scanning the array.
 *
 * At the end, `pos` represents the number of elements that are
 * not equal to `val`.
 *
 * Therefore, we return `pos` as `k`.
 *
 * The first `k` elements of nums will contain all elements that
 * are not equal to `val`.
 *
 * The elements beyond index k - 1 are not important.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Why O(n)?
 * The `for` loop scans through the array exactly once.
 *
 * Each element is checked only once, and there is no nested
 * loop.
 *
 * Therefore, the time complexity is:
 *
 * O(n)
 *
 * Why O(1) space?
 * We modify the original array in-place and use only a constant
 * number of extra variables (`i` and `pos`).
 *
 * No additional array, HashMap, HashSet, or other data
 * structure is used.
 *
 * Important Observation:
 * The order of the remaining elements does not matter in this
 * problem.
 *
 * Therefore, whenever we find an element that is NOT equal to
 * `val`, we simply place it at the next available position
 * using `pos`.
 *
 * Example:
 *
 * nums = [3,2,2,3]
 * val = 3
 *
 * i = 0 → nums[0] = 3 → ignore
 * i = 1 → nums[1] = 2 → nums[0] = 2
 * i = 2 → nums[2] = 2 → nums[1] = 2
 * i = 3 → nums[3] = 3 → ignore
 *
 * Result:
 * nums = [2,2,_,_]
 * k = 2
 *
 * ============================================================
 */
