// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example,for arr=[1,2,3],the following are all the permutations of arr:[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1].

// The next permutation of an array of integers is the next lexicographically greater permutation of its integer.More formally,if all the permutations of the array are sorted in one container according to their lexicographical order,then the next permutation of that array is the permutation that follows it in the sorted container.If such arrangement is not possible,the array must be rearranged as the lowest possible order(i.e.,sorted in ascending order).

// For example,the next permutation of arr=[1,2,3]is[1,3,2].Similarly,the next permutation of arr=[2,3,1]is[3,1,2].While the next permutation of arr=[3,2,1]is[1,2,3]because[3,2,1]does not have a lexicographical larger rearrangement.

// Given an array of integers nums,find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

// Example 1:

// Input:nums=[1,2,3]Output:[1,3,2]

// Example 2:

// Input:nums=[3,2,1]Output:[1,2,3]

// Example 3:

// Input:nums=[1,1,5]Output:[1,5,1]

// Constraints:

// 1<=nums.length<=100 0<=nums[i]<=100
//BRUTE FORCE APPROACH
// import java.util.Arrays;

// public class next_permutation {
//     public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         for (int j = n - 1; j > 0; j--) {
//             int i = j - 1;
//             if (nums[i] < nums[j]) {
//                 int k = 0;
//                 for (int a = n - 1; a > i; a--) {
//                     if (nums[a] > nums[i]) {
//                         k = a;
//                         break;
//                     }
//                 }
//                 int temp = nums[i];
//                 nums[i] = nums[k];
//                 nums[k] = temp;
//                 Arrays.sort(nums, j, n);
//                 break;
//             } else
//                 Arrays.sort(nums);
//             break;
//         }
//         for (int x : nums) {
//             System.out.println(x);
//         }
//     }
// }

// TWO POINTER APPROACH
public class next_permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        for (int j = n - 1; j > 0; j--) {
            int pivot = j - 1;
            if (nums[pivot] < nums[j]) {
                int k = 0;
                for (int a = n - 1; a > pivot; a--) {
                    if (nums[a] > nums[pivot]) {
                        k = a;
                        break;
                    }
                }
                int temp = nums[pivot];
                nums[pivot] = nums[k];
                nums[k] = temp;

                int left = pivot + 1;
                int right = n - 1;
                while (left < right) {
                    int temp1 = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp1;
                    left++;
                    right--;
                }

                return;
            }

        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp2 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp2;
            left++;
            right--;
        }

        for (int x : nums) {
            System.out.println(x);
        }
    }
}

// public class next_permutation {
// public void nextPermutation(int[] nums) {
// int n = nums.length;
// int p = -1;
// for (int i = n - 2; i >= 0; i--) {
// if (nums[i] < nums[i + 1]) {
// p = i;
// break;
// }
// }
// if (p != -1) {
// for (int i = n - 1; i >= 0; i--) {
// if (nums[i] > nums[p]) {
// int temp = nums[p];
// nums[p] = nums[i];
// nums[i] = temp;
// break;
// }
// }
// }
// int l = p + 1;
// int r = n - 1;
// while (l < r) {
// int temp = nums[l];
// nums[l] = nums[r];
// nums[r] = temp;
// l++;
// r--;
// }
// }
// }

/*
 * ============================================================
 * Problem: Next Permutation
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Arrays
 * Pattern: Two Pointers + Array Manipulation
 *
 * Approach:
 * First, we scan the array from right to left to find the pivot,
 * which is the first element that is smaller than the element
 * immediately after it.
 *
 * We then scan from the right side of the array to find the
 * smallest element that is greater than the pivot and swap
 * these two elements.
 *
 * After the swap, the elements after the pivot are reversed
 * using the two-pointer technique.
 *
 * Reversing the suffix is enough because the suffix is already
 * arranged in descending order when the pivot is found. Reversing
 * it puts the suffix into the smallest possible ascending order.
 *
 * If no pivot is found, the array is already the largest possible
 * permutation. In that case, we reverse the entire array to obtain
 * the smallest permutation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Why O(n)?
 * We scan the array from right to left to find the pivot,
 * scan from right to left again to find the element to swap,
 * and finally reverse the suffix using two pointers.
 *
 * Each operation takes O(n) time, and since these operations are
 * performed sequentially, the overall time complexity remains O(n).
 *
 * Why O(1) space?
 * We modify the array in-place and use only a constant number
 * of extra variables for indexes and swapping.
 *
 * This optimized approach avoids sorting the suffix, which would
 * take O(n log n), and instead reverses it in O(n) using two pointers.
 *
 * ============================================================
 */