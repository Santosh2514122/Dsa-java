package String.important;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";

        for(char ch : s.toCharArray()) {
            if(result.indexOf(ch) == -1)
                result += ch;
        }

        System.out.println(result);
    }

}
