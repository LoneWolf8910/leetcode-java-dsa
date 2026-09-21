// A simple implementation of binary search algorithm in Java. The binary search algorithm is used to find the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half, comparing the target value to the middle element of the array, and narrowing down the search range based on the comparison result.

public class binary_search {
    public int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
