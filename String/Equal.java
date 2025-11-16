package String.basic;

public class Equal {
    public static void main(String[] args) {
        String a = "abc";// scp
        String b = new String("abc");// heap section

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true
    }
}
