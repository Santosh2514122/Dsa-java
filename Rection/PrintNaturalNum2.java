package Rection1;

public class PrintNaturalNum2 {
    public static void main(String[] args)
    {
        printNos(1, 10);
    }
    public static void printNos(int initial, int last)
    {
        if (initial <= last) {
            System.out.print(initial + " ");
            printNos(initial + 1, last);
        }
    }
}

