package Twopointers;
//Given a sorted array A (sorted in ascending order), having N integers,
// find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.


public class CountPairsSumEqualsToK {
    //Naive Approch

    private static int naivePairs(int A[], int N, int X) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Skip the same element (i and j are equal)
                if (i == j)
                    continue;

                // Check if the sum of the pair equals X
                if (A[i] + A[j] == X)
                    return 1; // Pair exists

                // Since the array is sorted, if the sum exceeds X, break the inner loop
                if (A[i] + A[j] > X)
                    break;
            }
        }

        // No pair found with the given sum
        return 0;
    }





    static int pairs(int arr[],int X){
           int ans=0;
            int start=0;
            int end= arr.length-1;
            while (start<end){
            if(arr[start]+arr[end]==X){
                 ans++;
                start++;
                end--;
            }
            else if(arr[start]+arr[end]<X){
                start++;
            }
             else{
                    end--;
                }}
        return ans;
        }




    public static void main(String[] args) {
        int arr[]={2, 3,5,8,9, 10, 11};
        int N= arr.length;
        System.out.println(pairs(arr,11));

    }
}
