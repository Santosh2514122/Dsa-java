package String.important;

public class CountConsnant {
    public static void main(String[] args) {
        String s = "hello";
        int c = 0;

        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch) &&
                    !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                c++;
        }
        System.out.println(c);
    }
}
