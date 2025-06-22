package Rection1;

public class TailRec {
    public static void printN(int N)
    {
        if(N==0)
            return;
        else
            System.out.print(N + " ");

        printN(N-1);
    }
}
