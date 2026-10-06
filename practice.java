public class practice {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 10, 5, 9, 13, 10 };

        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // for (Object x : prefix) {
        // System.out.println(x);
        // }
    }
}
