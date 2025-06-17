package BitMagic;
public class CheckPower2 {
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }
    // Driver Code
    public static void main(String[] args)
    {
        // Function call
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

