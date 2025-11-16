package Math;
// count digit
import java.util.Scanner;
public class CountDigit {
    static int countDigits(int x)
    {
        int count = 0;// let
        while(x > 0)
        {
            x = x / 10;

            count++;
        }

        return count;
    }
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number :");
        int number =obj.nextInt();

        System.out.println(countDigits(number));
    }
}
// output 3

