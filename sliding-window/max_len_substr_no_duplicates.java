// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 105
// s consists of English letters, digits, symbols and spaces.
import java.util.HashSet;
public class max_len_substr_no_duplicates {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        int maxlength =0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<Character>();
        for (right = 0; right < len; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength, set.size());
        }     
        return maxlength;
    }
}


/*
 * ============================================================
 * Problem: Longest Substring Without Repeating Characters
 * Platform: LeetCode
 * Problem Number: 3
 * Difficulty: Medium
 * Topic: Strings, HashSet, Sliding Window
 * Pattern: Variable-Size Sliding Window
 *
 * Approach:
 * 1. Use two pointers, left and right, to maintain a window.
 * 2. Use a HashSet to store unique characters in the window.
 * 3. Expand the window by moving the right pointer.
 * 4. If a duplicate character is found, shrink the window
 * from the left until the duplicate is removed.
 * 5. Add the current character to the HashSet.
 * 6. Update the maximum length using the size of the set.
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(min(n, charset size))
 *
 * Key Idea:
 * Maintain a window containing only unique characters.
 * Expand it when possible and shrink it whenever a duplicate
 * appears. Each character is added and removed at most once.
 *
 * ============================================================
 */