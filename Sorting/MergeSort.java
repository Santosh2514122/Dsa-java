package Sorting;
public class MergeSort
{
    public static void printArr(int arr[]) // method for print arr
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei)//method
    {
        if (si >= ei) //base condition
        {
            return;
        }
        int mid = (si + ei) / 2;//mid
        mergeSort(arr, si, mid);//left port
        mergeSort(arr, mid + 1, ei);//right port
        merge(arr, si, mid, ei);//merge both
    }
    public static void merge(int arr[], int si, int mid, int ei)// method
    {
        int temp[] = new int[ei - si + 1];//create temp node
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) // check condition
        {
            if (arr[i] < arr[j])
            {
                temp[k++] = arr[i++];
            } else
            {
                temp[k++] = arr[j++];
            }
        }
        // /eft sorted port
        while (i <= mid) //left part
        {
            temp[k++] = arr[i++];
        }
// left  2nd sorted port
        while (j <= ei) //right part
        {
            temp[k++] = arr[j++];
        }
// copy the temp into original
        for (k = 0; k < temp.length; k++)
        {
            arr[si + k] = temp[k];
        }
    }
    public static void main(String[] args) // main method
    {
        int arr[] = {6, 3, 7, 9, 8, 4, -2};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
//output
//-2 3 4 6 7 8 9

