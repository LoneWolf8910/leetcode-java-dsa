// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

// Custom Judge:
// The judge will test your solution with the following code:
// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length
// int k = removeDuplicates(nums); // Calls your implementation
// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.
// Example 1:
// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
// Constraints:
//     1 <= nums.length <= 3 * 104
//     -100 <= nums[i] <= 100
//     nums is sorted in non-decreasing order.// TWO POINTERS APPROACH
import java.util.Arrays;

public class rm_duplicates {

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pointer1 = 0;
        System.out.print(nums[pointer1]);
        for (int i = 1; i < n; i++) {
            if (nums[pointer1] != nums[i]) {
                nums[pointer1 + 1] = nums[i];
                pointer1++;
                return nums[pointer1];
            } else
                continue;
        }
        return pointer1 + 1;
    }
}

/*
 * ============================================================
 * Problem: Remove Duplicates from Sorted Array
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Arrays
 * Pattern: Two Pointers
 *
 * Approach:
 * The array is already sorted in non-decreasing order, so
 * duplicate elements will always appear next to each other.
 *
 * We use two pointers:
 *
 * 1. pointer1:
 * Keeps track of the position of the last unique element.
 *
 * 2. i:
 * Scans through the array from left to right to find new
 * unique elements.
 *
 * We start pointer1 at index 0 because the first element is
 * always considered unique.
 *
 * For every element nums[i], we compare it with the element
 * at nums[pointer1].
 *
 * If they are different, we have found a new unique element.
 * We place this new element at the position immediately after
 * pointer1:
 *
 * nums[pointer1 + 1] = nums[i]
 *
 * Then we move pointer1 one position forward.
 *
 * If nums[i] is equal to nums[pointer1], it is a duplicate,
 * so we simply ignore it and continue scanning.
 *
 * At the end, pointer1 represents the index of the last unique
 * element. Therefore, the number of unique elements is:
 *
 * pointer1 + 1
 *
 * We return pointer1 + 1 as k.
 *
 * The first k elements of nums will contain all the unique
 * elements in their original sorted order.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Why O(n)?
 * The array is already sorted, so we do not need to sort it.
 * The for loop scans through the array exactly once.
 *
 * The pointer1 also only moves forward and never goes
 * backward.
 *
 * Therefore, the total work is linear:
 *
 * O(n)
 *
 * Why O(1) space?
 * We modify the original array in-place and use only a
 * constant number of extra variables such as pointer1,
 * i, and n.
 *
 * No additional array, HashMap, HashSet, or other data
 * structure is used.
 *
 * Important Observation:
 * The array is already sorted. Therefore, if:
 *
 * nums[pointer1] == nums[i]
 *
 * the current element is a duplicate.
 *
 * If:
 *
 * nums[pointer1] != nums[i]
 *
 * the current element is a new unique value.
 *
 * This property of the sorted array allows us to solve the
 * problem using the two-pointer technique in O(n) time.
 *
 * ============================================================
 */
