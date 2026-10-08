// Given an integer array nums,handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left<=right.Implement the NumArray class:

// NumArray(int[]nums)Initializes the object with the integer array nums.int sumRange(int left,int right)Returns the sum of the elements of nums between indices left and right inclusive(i.e.nums[left]+nums[left+1]+...+nums[right]).

// Example 1:

// Input["NumArray","sumRange","sumRange","sumRange"][[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]Output[null,1,-1,-3]

// Explanation NumArray numArray=new NumArray([-2,0,3,-5,2,-1]);numArray.sumRange(0,2); // return (-2) + 0 + 3 = 1
// numArray.sumRange(2,5); // return 3 + (-5) + 2 + (-1) = -1
// numArray.sumRange(0,5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

// Constraints:

// 1<=nums.length<=104-105<=nums[i]<=105 0<=left<=right<nums.length At most 104 calls will be made to sumRange.

class range_sum_query_immutable {
    int prefix[];

    public range_sum_query_immutable(int[] nums) {

        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }


    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */




/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

/*
 * ============================================================
 * Problem: Range Sum Query - Immutable
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Arrays
 * Pattern: Prefix Sum
 *
 * Approach:
 * We use the Prefix Sum technique to efficiently answer
 * multiple range-sum queries.
 *
 * Instead of calculating the sum between left and right every
 * time sumRange() is called, we calculate a prefix sum array
 * once when the NumArray object is created.
 *
 * Prefix Sum Definition:
 *
 * prefix[i] = sum of all elements before index i
 *
 * We create the prefix array with size:
 *
 * nums.length + 1
 *
 * The extra element at index 0 is initialized to 0.
 *
 * Example:
 *
 * nums =
 * [-2, 0, 3, -5, 2, -1]
 *
 * prefix =
 * [0, -2, -2, 1, -4, -2, -3]
 *
 * Construction:
 *
 * prefix[i + 1] = prefix[i] + nums[i]
 *
 * This means prefix[i + 1] stores the sum of all elements
 * from nums[0] through nums[i].
 *
 * Why do we use nums.length + 1?
 *
 * The extra zero at prefix[0] makes range-sum calculations
 * easier and avoids special cases when left = 0.
 *
 * Range Sum Formula:
 *
 * sumRange(left, right)
 *
 * is calculated as:
 *
 * prefix[right + 1] - prefix[left]
 *
 * Example:
 *
 * nums = [-2, 0, 3, -5, 2, -1]
 *
 * sumRange(2, 5)
 *
 * = 3 + (-5) + 2 + (-1)
 * = -1
 *
 * Using Prefix Sum:
 *
 * prefix[6] - prefix[2]
 *
 * = -3 - (-2)
 * = -1
 *
 * Therefore, every range query can be answered directly
 * using two prefix-sum values.
 *
 * Constructor:
 *
 * public range_sum_query_immutable(int[] nums)
 *
 * The constructor runs when the object is created.
 * It builds the prefix sum array once so that it can be reused
 * by every future sumRange() call.
 *
 * sumRange():
 *
 * public int sumRange(int left, int right)
 *
 * This method returns the sum between left and right inclusive
 * using the prefix-sum formula.
 *
 * Time Complexity:
 *
 * Constructor → O(n)
 *
 * Why?
 * We traverse the entire nums array once to build prefix[].
 *
 * sumRange() → O(1)
 *
 * Why?
 * Each query only performs one subtraction using two prefix
 * values. No loop is required.
 *
 * Therefore, for multiple queries:
 *
 * Preprocessing: O(n)
 * Each query: O(1)
 *
 * Space Complexity: O(n)
 *
 * Why?
 * We create an additional prefix array containing n + 1
 * elements.
 *
 * Important Concept:
 *
 * Prefix Sum is useful when we have to answer many queries
 * involving sums of continuous ranges.
 *
 * Instead of repeatedly calculating:
 *
 * nums[left] + nums[left + 1] + ... + nums[right]
 *
 * we calculate the prefix sum once and reuse it.
 *
 * General Formula:
 *
 * Range Sum = Prefix Sum after right
 * - Prefix Sum before left
 *
 * sumRange(left, right)
 * = prefix[right + 1] - prefix[left]
 *
 * ============================================================
 */