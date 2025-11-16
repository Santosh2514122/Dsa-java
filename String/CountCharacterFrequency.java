package String.important;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String s = "banana";
        char target = 'a';
        int count = 0;

        for(char ch : s.toCharArray()) {
            if(ch==target) count++;
        }

        System.out.println(count);
    }
}
