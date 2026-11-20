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
// s consists of English letters, digits, symbols and spaces

import java.util.HashSet;

public class practice {
   public int lengthOfLongestSubstring(String s) {
      int l = s.length();
      int left = 0;
      int maxlen =0;

      HashSet<Character> set = new HashSet<>();

      for (int right = 0; right < l; right++) {
         while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
         }

         set.add(s.charAt(right));
         maxlen = Math.max(maxlen, set.size());
      }


      return maxlen;
   }
}
