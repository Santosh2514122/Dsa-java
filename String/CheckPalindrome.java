package String.important;
//palindrome that means Reverse string and compare.
public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";

        for(int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
            //charAt() is a string method in Java that returns the character at a specific index.
        }
        if(s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

