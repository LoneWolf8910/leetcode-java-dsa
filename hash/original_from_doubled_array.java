// An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.

// Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.

 

// Example 1:

// Input: changed = [1,3,4,2,6,8]
// Output: [1,3,4]
// Explanation: One possible original array could be [1,3,4]:
// - Twice the value of 1 is 1 * 2 = 2.
// - Twice the value of 3 is 3 * 2 = 6.
// - Twice the value of 4 is 4 * 2 = 8.
// Other original arrays could be [4,3,1] or [3,1,4].
// Example 2:

// Input: changed = [6,3,0,1]
// Output: []
// Explanation: changed is not a doubled array.
// Example 3:

// Input: changed = [1]
// Output: []
// Explanation: changed is not a doubled array.
 

// Constraints:

// 1 <= changed.length <= 105
// 0 <= changed[i] <= 105

import java.util.HashMap;
import java.util.Arrays;

public class original_from_doubled_array {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[] {};
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : changed) {
            freqMap.put(num, (freqMap.getOrDefault(num, 0) + 1));
        }

        Arrays.sort(changed);
        int[] result = new int[(n / 2)];
        int index = 0;

        for (int num : changed) {
            if (freqMap.get(num) == 0)
                continue;
            int dnum = 2 * num;
            if (freqMap.getOrDefault(dnum, 0) > 0) {
                result[index] = num;
                freqMap.put(dnum, (freqMap.get(dnum) - 1));
                freqMap.put(num, (freqMap.get(num) - 1));
                index++;
            } else if (num == 0) {
                if (freqMap.get(0) < 2) {
                    return new int[] {};
                } 
                freqMap.put(num, (freqMap.get(num) - 2));
                result[index++] = num;

            } else
                return new int[] {};
        }

        return result;
    }
}


/*
 * ============================================================
 * Problem: Find Original Array From Doubled Array
 * Platform: LeetCode
 * Problem Number: 2007
 * Difficulty: Medium
 * Topic: Array, HashMap, Sorting
 * Pattern: Frequency Counting + Greedy
 *
 * Approach:
 * 1. Check if the length of changed is odd. If it is, return
 * an empty array because every original element must have
 * exactly one corresponding doubled element.
 * 2. Build a HashMap to store the frequency of each number.
 * 3. Sort changed in ascending order so smaller numbers are
 * processed before their doubled values.
 * 4. Traverse the sorted array and skip numbers whose
 * remaining frequency is zero, as they have already
 * been used in a pair.
 * 5. For each available number, find its double (num * 2).
 * If the double is available, add num to the result and
 * decrease the frequencies of both numbers.
 * 6. Handle zero carefully because 2 * 0 = 0. Two available
 * zeros are required to form one original zero.
 * 7. If a valid pair cannot be found, return an empty array.
 *
 * Time Complexity: O(n log n) average
 * Space Complexity: O(n)
 *
 * Key Idea:
 * Sorting ensures smaller values are processed before their
 * doubles, while the HashMap tracks the remaining occurrences
 * of each number. Each valid pair contributes one element
 * to the original array.
 * ============================================================
 */