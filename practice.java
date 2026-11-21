// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// Constraints:

// 2 <= nums.length <= 105
// -30 <= nums[i] <= 30
// The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

// Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
import java.util.HashSet;

public class practice {
   public int[] productExceptSelf(int[] nums) {
      int l = nums.length;
      int[] prod_ex_self = new int[l+1];
      int left[] = new int[l];
      int right[] = new int[l];
      
      for (int i = 1; i < l; i++) {
         left[i] = left[i] * nums[i -1];
      }

      for (int i = l-2; i >= 0; i--) {
         right[i] = right[i] * nums[i+1];
      }

      for (int i = 0; i < l+1; i++) {
         prod_ex_self[i] = right[i] * left[i];
      }
      return prod_ex_self;
   }
}
