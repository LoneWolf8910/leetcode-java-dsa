// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

// You must not use any built-in exponent function or operator.

// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

// Example 1:

// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// Example 2:

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

// Constraints:

// 0 <= x <= 231 - 1

public class mySqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + (right - left) / 2);

            if (mid == x / mid)
                return mid;

            if (mid < x / mid)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return right;
    }
}

/*
 * ============================================================
 * Problem: Sqrt(x)
 * Platform: LeetCode
 * Difficulty: Easy
 * Topic: Binary Search
 * Pattern: Binary Search on Answer
 *
 * Approach:
 * We need to find the integer square root of x, rounded down.
 *
 * Instead of calculating the square root directly, we use
 * Binary Search to find the largest integer whose square is
 * less than or equal to x.
 *
 * For example:
 *
 * x = 8
 *
 * 2² = 4 <= 8 ✅
 * 3² = 9 > 8 ❌
 *
 * Therefore, the answer is 2.
 *
 * We maintain two pointers:
 *
 * left → lower boundary of the search
 * right → upper boundary of the search
 *
 * Initially:
 *
 * left = 0
 * right = x
 *
 * During every iteration, we calculate:
 *
 * mid = left + ((right - left) / 2)
 *
 * We then compare mid with x / mid instead of calculating
 * mid * mid.
 *
 * Why?
 *
 * Because x can be as large as 2³¹ - 1, and calculating:
 *
 * mid * mid
 *
 * can cause integer overflow in Java.
 *
 * Therefore, instead of checking:
 *
 * mid * mid <= x
 *
 * we use:
 *
 * mid <= x / mid
 *
 * These comparisons are mathematically equivalent but the
 * division-based approach avoids integer overflow.
 *
 * Cases:
 *
 * 1. If:
 *
 * mid == x / mid
 *
 * then mid is the exact square root, so we return mid.
 *
 * 2. If:
 *
 * mid < x / mid
 *
 * then:
 *
 * mid² < x
 *
 * Therefore, mid could be the answer, but there may be
 * a larger valid value.
 *
 * We move right:
 *
 * left = mid + 1
 *
 * 3. Otherwise:
 *
 * mid > x / mid
 *
 * which means:
 *
 * mid² > x
 *
 * Therefore, mid is too large and we move left:
 *
 * right = mid - 1
 *
 * When the binary search finishes, left has crossed right.
 *
 * At this point:
 *
 * right → largest integer whose square is <= x
 * left → smallest integer whose square is > x
 *
 * Since we need the square root rounded DOWN, we return:
 *
 * right
 *
 * Example:
 *
 * x = 8
 *
 * 2² = 4 <= 8
 * 3² = 9 > 8
 *
 * At the end:
 *
 * right = 2
 * left = 3
 *
 * Therefore:
 *
 * return right;
 *
 * Edge Cases:
 *
 * x = 0 → 0
 * x = 1 → 1
 *
 * These are handled separately because x / mid would cause
 * division by zero if mid becomes 0.
 *
 * Time Complexity: O(log n)
 *
 * Why O(log n)?
 * Binary search eliminates approximately half of the possible
 * answers during every iteration.
 *
 * Space Complexity: O(1)
 *
 * Why O(1) space?
 * We only use a constant number of variables:
 *
 * left, right, mid
 *
 * No additional data structures are required.
 *
 * Important Concept:
 *
 * This is an example of "Binary Search on Answer".
 *
 * We are not searching for x itself.
 * We are searching for the largest possible answer whose
 * square does not exceed x.
 *
 * ============================================================
 */