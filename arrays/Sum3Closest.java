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