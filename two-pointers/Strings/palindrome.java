import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = true;

        int l = s.length();
        int left = 0;
        int right = l-1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else
                {flag =false;
                    break;
                }
        }

        if (flag == false) {
            System.out.println("The string is not a palindrome");
        }
        else{
            System.out.println("The string is a palindrome");
        }
    }
}
