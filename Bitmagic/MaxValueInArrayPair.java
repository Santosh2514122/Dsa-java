package BitMagic;
public class MaxValueInArrayPair {
    public static int findMaximum(int[] a, int n) {
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxi = Math.max(maxi, a[i] & a[j]);
            }
        }
        return maxi;
    }
}
