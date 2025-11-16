package Math;
//Each term = sum of previous two terms.
import java.util.*;
public class FibonacciSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + " " + b);

        for(int i=2; i<n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
