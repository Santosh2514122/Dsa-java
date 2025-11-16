package String.StrClassMethod.java;
//Removes spaces from start and end only.
public class Split {
    public static void main(String[] args) {
        String s = "a,b,c";
        String[] arr = s.split(",");
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

}
