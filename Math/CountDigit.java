package Math;
// count digit
public class CountDigit {
    static int countDigits(int x)
    {
        int res = 0;// let
        while(x > 0)
        {
            x = x / 10;

            res++;
        }

        return res;
    }
    public static void main (String[] args) {

        int number = 789;

        System.out.println(countDigits(number));
    }
}
// output 3

