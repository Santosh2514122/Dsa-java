package Math;
public class CheckAllDivisior9 {
    // method to print the divisors
    static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("The divisors of 35 are: ");
        printDivisors(35);
    }
}
//The divisors of 35 are:
//1 5 7 35

