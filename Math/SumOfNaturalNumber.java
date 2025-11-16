package Math.basic;
import java .util.*;
public class SumOfNaturalNumber {
    public static void  sumOfNatural(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
             sum=sum+i;
        }
        System.out.println("print the sum:"+sum);

    }
    public static void main(String arg[])
    {
        System.out.println("enetr the number :");
        Scanner Obj=new Scanner(System.in);
        int n=Obj.nextInt();
        sumOfNatural(n);// function call

    }
}
