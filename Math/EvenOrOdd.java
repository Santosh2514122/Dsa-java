package Math.basic;
import java .util.*;
public class EvenOrOdd {




    public static void main(String arg[])
    {
       Scanner obj=new Scanner(System.in);

        System.out.println("enter the number :");
        int n=obj.nextInt();


           int number=n%2;
           if(number==0)
           {
               System.out.println("number are even");

           }
           else {
               System.out.println("number are odd");
           }
    }

}
