package Math;
// hcf of two number  that means common parts
public class Hcf //class
{
    static int gcd(int a, int b)// method
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
//GCD of 98 and 56 is 14


