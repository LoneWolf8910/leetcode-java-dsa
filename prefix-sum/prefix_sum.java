import java.util.*;

public class prefix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Prefix array has one extra space
        int[] prefix = new int[arr.length + 1];

        // Build prefix sum
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Print prefix array
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
