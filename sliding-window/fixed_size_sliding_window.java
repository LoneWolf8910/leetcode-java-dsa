import java.util.*;
public class fixed_size_sliding_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-\n");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }

        int maxsum = sum;

        for (int right = k; right < arr.length; right++) {
            sum+= arr[right];
            sum-= arr[right - k];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}

