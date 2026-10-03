// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true

// Example 2:
// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 100
// -104 <= matrix[i][j], target <= 104

public class search_in_2D_array {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = false;

        int left = 0;
        int right = (m * n) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                flag = true;
                break;
            }

            else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return flag;
    }
}

/*
 * ============================================================
 * Problem: Search a 2D Matrix
 * Platform: LeetCode
 * Difficulty: Medium
 * Topic: Binary Search
 * Pattern: Binary Search on 2D Matrix
 *
 * Approach:
 * The matrix has two important properties:
 *
 * 1. Each row is sorted in non-decreasing order.
 *
 * 2. The first element of every row is greater than the last
 * element of the previous row.
 *
 * Because of these properties, the entire matrix can be treated
 * as one sorted 1D array.
 *
 * Example:
 *
 * [1, 3, 5, 7]
 * [10, 11, 16, 20]
 * [23, 30, 34, 60]
 *
 * We can conceptually treat it as:
 *
 * [1,3,5,7,10,11,16,20,23,30,34,60]
 *
 * We do not actually create a new array.
 *
 * Instead, we perform Binary Search using a virtual 1D index.
 *
 * Total number of elements:
 *
 * m * n
 *
 * Therefore, the binary-search range is:
 *
 * left = 0
 * right = (m * n) - 1
 *
 * For every middle index:
 *
 * mid = left + ((right - left) / 2)
 *
 * 'mid' represents a virtual 1D index.
 *
 * We convert this virtual index into the actual row and column
 * of the matrix using:
 *
 * row = mid / n
 * col = mid % n
 *
 * where n is the number of columns.
 *
 * For example:
 *
 * mid = 6
 * n = 4
 *
 * row = 6 / 4 = 1
 * col = 6 % 4 = 2
 *
 * Therefore:
 *
 * matrix[1][2]
 *
 * is the element represented by virtual index 6.
 *
 * Binary Search:
 *
 * If:
 *
 * matrix[row][col] == target
 *
 * then the target has been found.
 *
 * If:
 *
 * matrix[row][col] < target
 *
 * then the target must be somewhere to the RIGHT.
 *
 * Therefore:
 *
 * left = mid + 1
 *
 * If:
 *
 * matrix[row][col] > target
 *
 * then the target must be somewhere to the LEFT.
 *
 * Therefore:
 *
 * right = mid - 1
 *
 * If the loop finishes without finding the target, the target
 * does not exist in the matrix and we return false.
 *
 * Example:
 *
 * matrix = [[1,3,5,7],
 * [10,11,16,20],
 * [23,30,34,60]]
 *
 * target = 3
 *
 * The virtual array is:
 *
 * [1,3,5,7,10,11,16,20,23,30,34,60]
 *
 * Binary Search eventually reaches the virtual index of 3.
 *
 * Therefore:
 *
 * return true
 *
 * Time Complexity: O(log(m * n))
 *
 * Why O(log(m * n))?
 * There are m * n total elements, and we perform only one
 * Binary Search over the entire virtual array.
 *
 * Binary Search reduces the search space by approximately half
 * during every iteration.
 *
 * Space Complexity: O(1)
 *
 * Why O(1) space?
 * We only use a constant number of variables:
 *
 * left, right, mid, row, col
 *
 * No additional array or data structure is created.
 *
 * Important Concept:
 *
 * The main trick in this problem is treating a sorted 2D matrix
 * as a virtual 1D sorted array.
 *
 * Virtual index:
 *
 * mid
 *
 * Convert to matrix coordinates:
 *
 * row = mid / n
 * col = mid % n
 *
 * This allows us to apply ordinary Binary Search directly to
 * a 2D matrix.
 *
 * ============================================================
 */
