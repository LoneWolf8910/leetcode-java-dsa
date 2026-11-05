// Given an input string s,reverse the order of the words.

// A word is defined as a sequence of non-space characters.The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words.The returned string should only have a single space separating the words.Do not include any extra spaces.

// Example 1:

// Input:s="the sky is blue"Output:"blue is sky the"Example 2:

// Input:s="  hello world  "Output:"world hello"Explanation:Your reversed string should not contain leading or trailing spaces.Example 3:

// Input:s="a good   example"Output:"example good a"Explanation:You need to reduce multiple spaces between two words to a single space in the reversed string.

// Constraints:

// 1<=s.length<=104 s contains English letters(upper-case and lower-case),digits,and spaces' '.There is at least one word in s.

// Follow-up:If the string data type is mutable in your language,can you solve it in-place with O(1)extra space?


import java.util.*;
public class reverse_words {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        int n = words.length;

        StringBuilder sb = new StringBuilder();

        for (int i = n-1; i >= 0; i--) {
            if (i == n-1) {
                sb.append(words[i]);
            }
            else{

                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }    
}


/*
 * ============================================================
 * Problem: Reverse Words in a String
 * Platform: LeetCode
 * Problem Number: 151
 * Difficulty: Medium
 * Topic: String, StringBuilder
 * Pattern: String Splitting + Reverse Traversal
 *
 * Approach:
 * 1. Use trim() to remove leading and trailing spaces from
 * the input string.
 *
 * 2. Use split("\\s+") to divide the string into a String
 * array of words.
 *
 * Understanding trim():
 * - Removes whitespace from the beginning and end
 * of the string.
 *
 * Understanding split("\\s+"):
 * - split() divides a string into multiple parts.
 * - \\s represents whitespace.
 * - + means one or more occurrences.
 * - Therefore, split("\\s+") separates words wherever
 * one or more consecutive spaces occur.
 *
 * 3. Traverse the words array backwards, starting from
 * the last index and moving towards the first.
 *
 * 4. Use StringBuilder to construct the reversed string.
 * - Append the first word without a leading space.
 * - Append a single space before every subsequent word.
 *
 * 5. Convert StringBuilder into a String using toString()
 * and return the result.
 *
 * Time Complexity: O(n), where n is the length of the string.
 * Space Complexity: O(n), for the words array and StringBuilder.
 *
 * Key Idea:
 * Instead of reversing individual characters, split the
 * sentence into words and traverse the resulting String
 * array backwards. trim() and split("\\s+") handle
 * unnecessary spaces, while StringBuilder constructs the
 * final string with exactly one space between words.
 * ============================================================
 */