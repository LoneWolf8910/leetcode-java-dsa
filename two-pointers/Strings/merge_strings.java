// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.

public class merge_strings {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i<l1 || j<l2) {
            if (i < l1) {
                
                sb.append(word1.charAt(i));
                i++;
            }

            if (j<l2) {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}

/*
 * ============================================================
 * Problem: Merge Strings Alternately
 * Platform: LeetCode
 * Problem Number: 1768
 * Difficulty: Easy
 * Topic: String, StringBuilder
 * Pattern: Two Pointers + Alternating Traversal
 *
 * Approach:
 * 1. Calculate the lengths of both input strings using
 * length().
 *
 * 2. Initialize two pointers:
 * - i = 0 for word1.
 * - j = 0 for word2.
 *
 * 3. Create a StringBuilder to construct the merged string
 * efficiently.
 *
 * 4. Use a while loop with the condition:
 * (i < l1 || j < l2)
 *
 * The OR (||) operator ensures that the loop continues
 * until both strings have been completely processed.
 *
 * 5. Inside the loop:
 * - Check if i < l1. If true, append the character
 * from word1 at index i and increment i.
 * - Check if j < l2. If true, append the character
 * from word2 at index j and increment j.
 *
 * 6. Independent boundary checks prevent
 * StringIndexOutOfBoundsException when the strings
 * have different lengths.
 *
 * 7. Convert StringBuilder into a String using toString()
 * and return the merged result.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * Key Idea:
 * Use two independent pointers to traverse both strings
 * alternately. Append characters to StringBuilder whenever
 * the corresponding pointer is within its string's bounds.
 * This also handles unequal string lengths without
 * requiring separate loops for leftover characters.
 * ============================================================
 */