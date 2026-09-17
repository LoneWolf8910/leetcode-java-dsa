// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 

// Constraints:

//     nums1.length == m
//     nums2.length == n
//     0 <= m <= 1000
//     0 <= n <= 1000
//     1 <= m + n <= 2000
//     -106 <= nums1[i], nums2[i] <= 106


public class median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newarr = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            newarr[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++){
            newarr[nums1.length + i] = nums2[i];
        }

        for(int i = 0; i<newarr.length -1; i++){
            for(int j = 0; j < newarr.length -1 - i; j++){
                if(newarr[j] > newarr[j+1]){
                    int temp = newarr[j];
                    newarr[j] = newarr[j+1];
                    newarr[j+1] = temp;           
                }
            }
        }

        if(newarr.length % 2 == 0){
            int mid1 = newarr.length /2;
            int mid2 = mid1 - 1;
            return ((newarr[mid1] + newarr[mid2])/2.0);
        }
        else{
            int mid = newarr.length /2;
            return (newarr[mid]);
        }  
    }
}

/*
 * Problem: Median of Two Sorted Arrays
 * Difficulty: Hard
 *
 * LeetCode: #4
 *
 * Given two sorted arrays nums1 and nums2, return the median
 * of the two sorted arrays.
 *
 * Required Time Complexity: O(log(m + n))
 */