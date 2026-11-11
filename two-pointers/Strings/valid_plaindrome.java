// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.

public class valid_plaindrome {
    public boolean isPalindrome(String s) {
        char[] ch = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int i =0;
        int j = ch.length -1;

        while (i<j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

/*
 * ============================================================
 * Problem: Valid Palindrome
 * Platform: LeetCode
 * Problem Number: 125
 * Difficulty: Easy
 * Topic: String, Array
 * Pattern: Regex + Two Pointers
 *
 * Approach:
 * 1. Clean the input string using replaceAll() with the
 * regular expression [^a-zA-Z0-9].
 *
 * 2. Understanding the Regex:
 * - [ ] defines a character class.
 * - ^ inside the beginning of [ ] means NOT.
 * - a-z represents lowercase English letters.
 * - A-Z represents uppercase English letters.
 * - 0-9 represents numeric digits.
 * - Therefore, [^a-zA-Z0-9] matches anything that is
 * NOT an English letter or a digit.
 *
 * 3. replaceAll("[^a-zA-Z0-9]", "") removes all spaces,
 * punctuation marks and special characters.
 *
 * 4. Use toLowerCase() to convert the cleaned string
 * into lowercase so that uppercase and lowercase
 * characters are treated equally.
 *
 * 5. Use toCharArray() to convert the cleaned String
 * into a character array.
 *
 * 6. Initialize two pointers:
 * - i = 0 (first index).
 * - j = ch.length - 1 (last index).
 *
 * 7. Traverse the character array from both ends:
 * - Compare ch[i] and ch[j].
 * - If they are different, return false.
 * - Otherwise, move i forward and j backward.
 *
 * 8. If all corresponding characters match, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Key Idea:
 * First normalize the string by removing all non-alphanumeric
 * characters and converting it to lowercase. Then use the
 * Two Pointers technique to compare characters from opposite
 * ends without reversing the string.
 * ============================================================
 */