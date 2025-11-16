package Math;
import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = (x * y) / gcd;

        System.out.println("LCM = " + lcm);
    }

}
