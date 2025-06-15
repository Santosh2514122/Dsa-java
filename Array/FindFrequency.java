package Array;
//Frequencies in a Sorted Array
public class FindFrequency {  static void printFreq(int arr[], int N)
{
    // Stores the frequency of an element
    int freq = 1;
    // Traverse the array arr[]
    for (int i = 1; i < N; i++) {
        // If the current element is equal
        // to the previous element
        if (arr[i] == arr[i - 1]) {
            // Increment the freq by 1
            freq++;
        }
        // Otherwise,
        else {
            System.out.println("Frequency of "
                    + arr[i - 1]
                    + " is: " + freq);
            // Update freq
            freq = 1;
        }
    }
    System.out.println("Frequency of " + arr[N - 1]
            + " is: " + freq);
}
    public static void main(String args[])
    {
        int arr[]
                = { 1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10 };
        int N = arr.length;
        printFreq(arr, N);
    }
}
//Frequency of 1 is: 3
//Frequency of 2 is: 1
//Frequency of 3 is: 2
//Frequency of 5 is: 2
//Frequency of 8 is: 3
//Frequency of 9 is: 2
//Frequency of 10 is: 1
//
//Process finished with exit code 0
