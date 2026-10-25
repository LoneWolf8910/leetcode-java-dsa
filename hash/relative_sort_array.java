// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

 

// Example 1:

// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
// Output: [2,2,2,1,4,3,3,9,6,7,19]
// Example 2:

// Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
// Output: [22,28,8,6,17,44]
 

// Constraints:

// 1 <= arr1.length, arr2.length <= 1000
// 0 <= arr1[i], arr2[i] <= 1000
// All the elements of arr2 are distinct.
// Each arr2[i] is in arr1.

import java.util.Arrays;
import java.util.HashMap;

public class relative_sort_array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int index = 0;
        
        int[] result = new int[n1];
        HashMap<Integer, Integer> freq_map = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            freq_map.put(arr1[i], (freq_map.getOrDefault(arr1[i], 0)+1));
        }

        for (int num : arr2) {
            int freq = freq_map.get(num);

            for (int i = 0; i < freq; i++) {
                result[index++] = num;
            }
            freq_map.remove(num);
        }
        int[] remaining = new int[n1 - index];
        int j =0;
        for (int key : freq_map.keySet()) {
            for (int i = 0; i < freq_map.get(key); i++) {
                remaining[j++] = key;
            }
        }
        Arrays.sort(remaining);
        for (int i : remaining) {
            result[index++] = i;
        }
            

        return result;
    }
}


/*
 * ============================================================
 * Problem: Relative Sort Array
 * Platform: LeetCode
 * Problem Number: 1122
 * Difficulty: Easy
 * Topic: Arrays / Hash Table / Sorting
 * Pattern: Frequency Counting + Custom Order + Sorting
 *
 * Approach:
 * 1. Create a HashMap to count the frequency of every element
 * in arr1.
 *
 * 2. Traverse arr2 in its given order:
 * - Retrieve the frequency of the current number.
 * - Add that number to the result array as many times as
 * its frequency indicates.
 * - Remove the number from the HashMap after processing it.
 *
 * 3. The remaining HashMap entries represent elements that
 * do not appear in arr2.
 *
 * 4. Create a remaining array of size n1 - index.
 *
 * 5. Copy each remaining key into the remaining array according
 * to its frequency.
 *
 * 6. Sort the remaining array in ascending order using
 * Arrays.sort().
 *
 * 7. Append the sorted remaining elements to the result array
 * and return the result.
 *
 * Why HashMap?
 * It stores each distinct number and its frequency, allowing
 * average O(1) lookup and update operations.
 *
 * Time Complexity: O(n1 + n2 + r log r) average
 * - Building the frequency map takes O(n1) average time.
 * - Processing arr2 takes O(n2 + p), where p is the number
 * of elements written into the result during this step.
 * - Collecting the remaining elements takes O(r + u), where
 * r is the number of remaining elements and u is the number
 * of remaining distinct keys.
 * - Sorting the remaining array takes O(r log r).
 * - Since p + r = n1, the overall complexity simplifies to
 * O(n1 + n2 + r log r).
 *
 * Space Complexity: O(n1)
 * - The HashMap stores up to n1 distinct elements.
 * - The result and remaining arrays require linear space.
 *
 * Key Idea:
 * Use element frequencies to reproduce arr2's ordering first,
 * then sort the elements absent from arr2 and append them.
 *
 * ============================================================
 */
