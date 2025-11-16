package String.important;
// count vowel
public class CheckVowel {
    public static void main(String[] args) {
        String s = "Educationaeiou";
        int count = 0;

        for(char ch : s.toLowerCase().toCharArray())//for each
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }

        System.out.println(count);
    }
}
