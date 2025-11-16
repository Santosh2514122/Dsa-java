package String.important;

public class FindLargestWords {
    public static void main(String[] args) {
        String s = "Java programming language";
        String[] arr = s.split(" ");

        String longest = "";
        for(String w : arr) {
            if(w.length() > longest.length())
                longest = w;
        }
        System.out.println(longest);
    }
}
