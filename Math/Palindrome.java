package Math;
//If reverse of number == original → Palindrome.
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }

        if (rev == temp)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome");
    }
}
