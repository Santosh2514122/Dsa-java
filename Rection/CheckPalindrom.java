package Rection1;

public class CheckPalindrom {
    static boolean isPalRec(String str,
                            int s, int e)
    {
        // If there is only one character
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
    // Driver Code
    public static void main(String args[])
    {
        String str = "geeg";
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
