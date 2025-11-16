package String.important;

public class SwapOfCase {
    public static void main(String[] args) {
        String s = "JaVa";
        String ans = "";

        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch))
                ans += Character.toLowerCase(ch);
            else
                ans += Character.toUpperCase(ch);
        }

        System.out.println(ans);
    }
}
