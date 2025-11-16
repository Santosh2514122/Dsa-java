package Math.basic;
import java.util.*;
public class SumOfSquare {
    public static void sumOfSquare(int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("sumof square:"+sum);
    }


    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=obj.nextInt();

        sumOfSquare( n);
    }
}
