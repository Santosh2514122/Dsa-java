package Math.basic;

public class nThTermOfAp {

    public static int nthTermOfAP(int a1, int a2, int n)
    {
        int nthTerm = a1, d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
    }

    public static void main(String[] args)
    {
        int a1 = 2, a2 = 3;
        int n = 4;
        System.out.println(nthTermOfAP(a1, a2, n));
    }
}
