
// This is a basic example of linear search technique.
import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element:-\n ");
        int target = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
            }
        }
    }
}