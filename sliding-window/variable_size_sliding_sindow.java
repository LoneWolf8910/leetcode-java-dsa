import java.util.*;

public class variable_size_sliding_sindow {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:-\n");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum yopu want to find:-\n");
        int target = sc.nextInt();
        
        int sum = 0;
        int minlength = Integer.MAX_VALUE;

        int right = 0;
        int left = 0;
        
        for (right = 0; right < arr.length; right++) {
            sum += arr[right];


            while (sum >= target) {
                minlength = Math.min(
                    minlength,
                    (right - left+1)
                );

                sum -= arr[left];
                left++;
            }
        }
        
        System.out.println(minlength);
    }
}
