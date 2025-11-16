package Math.basic;
import  java.util.*;
public class MultipleOfTable {
  public static  void  print(int n)
  {
      for(int i=1;i<=10;i++)
      {
          int Table=n*i;
          System.out.println("Table:"+Table);
      }
  }
    public static void main(String args[])
    {
       Scanner object=new Scanner(System.in);
        System.out.println(" enter number of table ");
            int n=object.nextInt();
            print(n);  // call function



    }

}
