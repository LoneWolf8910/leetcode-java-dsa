// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

public class reverse_vowels {
    public String reverseVowels(String s) {
        int l = s.length();
        char[] ch = s.toCharArray();

        int left = 0;
        int right = l - 1;

        while (left<right) {
            while (left < right && "aeiouAEIOU".indexOf(ch[left]) == -1) {
                left ++;
            }
            while (left < right && "aeiouAEIOU".indexOf(ch[right]) == -1) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}

//Other nethod
// public boolean helper(char c){
//         return c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c =='u'|| c =='A'||c == 'E'||c=='I'||c == 'O'||c == 'U'; 
//         }

// public String reverseVowels(String s) {
//         char []arr= s.toCharArray();
//         int i=0;
//         int j=arr.length-1;

//         while(i < j){
//             while( i < j && !helper(arr[i])){
//                 i++;
//             }
//             while(i < j && !helper(arr[j])){
//                 j--;
//             }

//             char temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         return new String(arr);

/*
 * ============================================================
 * Problem: Reverse Vowels of a String
 * Platform: LeetCode
 * Problem Number: 345
 * Difficulty: Easy
 * Topic: String, Array
 * Pattern: Two Pointers + In-Place Swapping
 *
 * Approach:
 * 1. Calculate the length of the input string using length().
 *
 * 2. Convert the input String into a character array using
 * toCharArray(), since Strings in Java are immutable.
 *
 * 3. Initialize two pointers:
 * - left = 0 (first index).
 * - right = l - 1 (last index).
 *
 * 4. Traverse the character array while left < right.
 *
 * 5. Move the left pointer forward until a vowel is found.
 * Use indexOf() to check whether the current character
 * exists in the vowel collection "aeiouAEIOU".
 *
 * 6. Similarly, move the right pointer backward until
 * another vowel is found.
 *
 * Understanding indexOf():
 * - indexOf(character) returns the position of the
 * character if it exists in the String.
 * - It returns -1 if the character is not found.
 * - Therefore, indexOf(ch[left]) == -1 means that
 * the current character is NOT a vowel.
 *
 * 7. Once both pointers identify vowels, swap the
 * characters using a temporary variable.
 *
 * 8. Move left forward and right backward to continue
 * searching for the next pair of vowels.
 *
 * 9. Convert the modified character array back into a
 * String using new String(ch) and return it.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Key Idea:
 * Use two pointers starting from opposite ends of the
 * character array. Skip all non-vowel characters, swap
 * the vowels found at both ends, and move towards the
 * centre until all vowels are reversed.
 * ============================================================
 */