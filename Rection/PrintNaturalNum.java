package Rection1;
public class PrintNaturalNum {
    static void printNos(int n)
    { if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
    //  main function
    public static void main(String[] args)
    {
        printNos(10);
    }
}


