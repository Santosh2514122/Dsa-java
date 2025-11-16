package Math.basic;
import java.util.*;
public class SumOfOppositeDice {



        public static int oppositeFaceOfDice(int n)
        {
            int ans;
            if (n == 1) {
                ans = 6;
            }
            else if (n == 2) {
                ans = 5;
            }
            else if (n == 3) {
                ans = 4;
            }
            else if (n == 4) {
                ans = 3;
            }
            else if (n == 5) {
                ans = 2;
            }
            else {
                ans = 1;
            }
            return ans;
        }

        public static void main(String[] args)
        {

            Scanner obj=new Scanner(System.in);
            System.out.println("enter the number");
            int n=obj.nextInt();
            System.out.println(oppositeFaceOfDice(n));// function call
        }
    }



