package BitMagic;

public class CheckKthbit1
{static void isKthBitSet(int n, int k)
{
    if (((n >> (k - 1)) & 1) != 0)
        System.out.println("SET");
    else
        System.out.println("NOT SET");
}
    // Driver code
    public static void main(String[] args)
    {
        int n = 5, k = 1;
        // Function call
        isKthBitSet(n, k);
    }
}

