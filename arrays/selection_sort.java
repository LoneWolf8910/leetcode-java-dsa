// This is basically a program that presents the Selection Sort Algorithm as well as teh Selection sort technique.

import java.util.*;

public class selection_sort {

    // Selection Sort Algo...
    public static void selectionSort(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minindex = i;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minindex])
                    minindex = j;
            }

            int temp = nums[i];
            nums[i] = nums[minindex];
            nums[minindex] = temp;
        }

        for (int x : nums) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        selectionSort(nums);
    }
}
