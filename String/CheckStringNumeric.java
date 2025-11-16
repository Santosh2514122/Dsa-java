package String.important;

public class CheckStringNumeric {
    public static void main(String[] args) {
        String s = "12345";
        boolean flag = true;

        for(char ch : s.toCharArray()) {
            if(!Character.isDigit(ch)) flag = false;
        }
        System.out.println(flag);
    }
}
