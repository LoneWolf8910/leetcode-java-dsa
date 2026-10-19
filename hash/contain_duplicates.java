import java.util.HashSet;

public class contain_duplicates {
    public boolean cont_duplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        } 

        return false;
    }
}

/*
 * ============================================================
 * Problem: Contains Duplicate
 * Platform: LeetCode
 * Problem Number: 217
 * Difficulty: Easy
 * Topic: Arrays / Hash Table
 * Pattern: HashSet Lookup
 *
 * Approach:
 * 1. Create an empty HashSet to store elements encountered.
 * 2. Traverse the array from left to right.
 * 3. For each element, attempt to add it to the HashSet.
 * 4. HashSet.add(element) returns:
 * - true if the element was not already present.
 * - false if the element already existed in the set.
 * 5. If add() returns false, a duplicate has been found,
 * so immediately return true.
 * 6. If the entire array is traversed without finding a
 * duplicate, return false.
 *
 * Why HashSet?
 * A HashSet stores unique elements and provides average O(1)
 * lookup and insertion. It is ideal when we only need to
 * determine whether an element has appeared before.
 *
 * Time Complexity: O(n) average
 * - Each element is processed at most once.
 * - HashSet insertion takes O(1) average time.
 *
 * Space Complexity: O(n) worst case
 * - If all elements are distinct, the set may store all n
 * elements before the loop finishes.
 *
 * Key Idea:
 * Use the return value of HashSet.add() to detect duplicates
 * without explicitly checking contains() first.
 *
 * ============================================================
 */
