
// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 

// Constraints:

// 1 <= s.length <= 105
// s[i] is a printable ascii character.


public class reverse_string {
    public void reverseString(char[] s) {
        int l = s.length;
        int left = 0;
        int right = l - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        return;
    }
}

/*
 * ============================================================
 * Problem: Reverse String
 * Platform: LeetCode
 * Problem Number: 344
 * Difficulty: Easy
 * Topic: Array, String
 * Pattern: Two Pointers + In-Place Swapping
 *
 * Approach:
 * 1. Initialize two pointers:
 * - left = 0 (first index of the character array).
 * - right = s.length - 1 (last index of the array).
 *
 * 2. Run a while loop as long as left < right.
 *
 * 3. Swap the characters at the left and right positions
 * using a temporary variable.
 *
 * 4. Move the left pointer one position forward and the
 * right pointer one position backward.
 *
 * 5. Continue swapping until both pointers meet or cross.
 *
 * 6. The original character array is modified in-place.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Key Idea:
 * Use two pointers starting from opposite ends of the array.
 * Swap their characters and move towards the centre.
 * This reverses the array without creating an additional
 * character array.
 * ============================================================
 */