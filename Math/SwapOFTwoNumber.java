package Math.basic;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class SwapOFTwoNumber {
     public static void SwapOfTwoN(int a,int b)
     {
         int temp=a;
         a=b;
         b=temp;
         System.out.println(" value of a:"+a+" value of b:"+b);
     }
    public static void main(String arg[])
    {
          Scanner obj=new Scanner(System.in);
        System.out.println("enter the  value of a:");
         int a=obj.nextInt();
        System.out.println("enter the   value of b :");
        int b=obj.nextInt();
        SwapOfTwoN( a, b);// function call

    }
}
