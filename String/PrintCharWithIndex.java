package String.important;

public class PrintCharWithIndex {
    public static void main(String[] args) {
        String s = "Java";

        for(int i=0; i<s.length(); i++)
            System.out.println(i + " -> " + s.charAt(i));
    }
}
