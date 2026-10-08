// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104

public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (nums[mid] == target) {
                return mid;

            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else if (nums[mid] > target)
                right = mid - 1;
        }
        return left;
    }
}

/*
 * ============================================================
 * Problem: Search Insert Position
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Binary Search
 * Pattern: Modified Binary Search
 *
 * Approach:
 * We use Binary Search because the given array is already sorted
 * and the problem requires an O(log n) runtime complexity.
 *
 * We maintain two pointers:
 *
 * left → beginning of the current search range
 * right → end of the current search range
 *
 * We calculate the middle index using:
 *
 * mid = left + ((right - left) / 2)
 *
 * This avoids potential integer overflow compared to:
 *
 * (left + right) / 2
 *
 * During every iteration:
 *
 * 1. If nums[mid] == target:
 *
 * The target has been found.
 * We immediately return mid.
 *
 * 2. If nums[mid] < target:
 *
 * The target must be somewhere to the RIGHT.
 * Therefore:
 *
 * left = mid + 1
 *
 * 3. If nums[mid] > target:
 *
 * The target must be somewhere to the LEFT.
 * Therefore:
 *
 * right = mid - 1
 *
 * If the target is not present, eventually:
 *
 * left > right
 *
 * At this point, the 'left' pointer is exactly at the position
 * where the target should be inserted while maintaining the
 * sorted order of the array.
 *
 * Therefore, after the binary-search loop finishes, we return:
 *
 * left
 *
 * Example:
 *
 * nums = [1,3,5,6]
 * target = 2
 *
 * The target is not present.
 *
 * After binary search:
 *
 * left = 1
 * right = 0
 *
 * Therefore, the target should be inserted at index 1.
 *
 * Result:
 *
 * 1
 *
 * Another example:
 *
 * nums = [1,3,5,6]
 * target = 7
 *
 * After binary search:
 *
 * left = 4
 * right = 3
 *
 * Therefore, 7 should be inserted at index 4.
 *
 * Result:
 *
 * 4
 *
 * Time Complexity: O(log n)
 *
 * Why O(log n)?
 * Binary search eliminates approximately half of the remaining
 * search space during every iteration.
 *
 * Space Complexity: O(1)
 *
 * Why O(1) space?
 * We only use a constant number of variables:
 *
 * left, right, and mid
 *
 * No additional data structures are created.
 *
 * Important Concept:
 * This problem demonstrates that Binary Search can be used not
 * only to find an existing element, but also to find the correct
 * position where an element should be inserted.
 *
 * If target exists:
 *
 * return mid
 *
 * If target does not exist:
 *
 * return left
 *
 * The 'left' pointer naturally becomes the insertion position
 * when the binary-search range becomes empty.
 *
 * ============================================================
 */