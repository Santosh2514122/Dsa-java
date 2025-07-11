package BitMagic;

public class CheckPower {public static boolean isPowerofTwo(long n)
{
    return (n != 0) && ((n & (n - 1)) == 0);
}

    // Driver code
    public static void main(String[] args)
    {
        // Function call
        if (isPowerofTwo(30)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        if (isPowerofTwo(128)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

