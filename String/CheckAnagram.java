package String.important;
import java.util.*;
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String a = "listen";
        String b = "silent";
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if(Arrays.equals(x,y))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

}
//Anagram