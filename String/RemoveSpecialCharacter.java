package String.important;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String s = "Ja@va#123";
        System.out.println(s.replaceAll("[^  a-z ,A-Z ,0-9]",""));
    }
}
