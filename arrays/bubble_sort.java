//This is a program that presents the working of the Bubble Sort Algorithm as well as teh bubble sortin technique.

import java.util.*;

public class bubble_sort {

    // Bubble Sort Algo...
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int x : nums) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        bubbleSort(nums);

    }

}
