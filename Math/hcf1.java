package Math;
import java .util.*;
public class hcf1 {

    public static  void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number :");
        int a=obj.nextInt();
        System.out.println("enter the second number :");
        int b=obj.nextInt();

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("gcd"+a);
    }
}
