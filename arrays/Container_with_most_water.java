// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.
// Example 1:

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:

// Input: height = [1,1]
// Output: 1

 

// Constraints:

//     n == height.length
//     2 <= n <= 105
//     0 <= height[i] <= 104


//BRUTE FORCE APPROACH
public class Container_with_most_water {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxcapacity = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int capacity = Math.abs(Math.min(height[i], height[j]) * (j - i));
                if(capacity > maxcapacity)
                    {
                        maxcapacity = capacity;
                    }
                }
            }
            
            return maxcapacity;
        }
    }
    
    //But this wont be submitted there because the time complexity or teh time required in teh problem is less and thsi will take long time for gettting executed for large inputs. So we will use two pointer approach to solve this problem in O(n) time complexity.

//TWO POINTER APPROACH
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxCapacity = 0;

        while (left < right) {

            int width = right - left;

            int containerHeight = Math.min(height[left], height[right]);

            int capacity = width * containerHeight;

            if (capacity > maxCapacity) {
                maxCapacity = capacity;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxCapacity;
    }
}

/*
 * ============================================================
 * Problem: Container With Most Water
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Arrays
 * Pattern: Two Pointers
 *
 * Approach:
 * We use two pointers, one at the beginning and one at the end of the array.
 *
 * We calculate the area formed by the lines at the two pointers and update the maximum area if necessary.
 *
 * We then move the pointer pointing to the shorter line inward, as this may lead to a larger area.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Why O(n)?
 * We traverse the array only once, moving the pointers towards each other until they meet.
 * now we will submit this code because it is optimized and will take less time to execute for large inputs.
 *============================================================= 
*/