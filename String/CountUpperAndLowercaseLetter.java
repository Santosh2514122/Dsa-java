package String.important;

public class CountUpperAndLowercaseLetter {
    public static void main(String[] args) {
        String s = "JaVa";
        int up = 0, low = 0;

        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) up++;
            else if(Character.isLowerCase(ch)) low++;
        }

        System.out.println(up + " " + low);
    }
}
