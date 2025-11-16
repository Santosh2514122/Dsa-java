package String.basic;
public class Literal {
    public static void main(String[] args) {
        String s1 = "Java";// scp
        String s2 = "Java";// scp
        String s3 = new String("Java");// heap memory

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
    }
}


