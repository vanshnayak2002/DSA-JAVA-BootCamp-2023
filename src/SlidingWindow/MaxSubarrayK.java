package SlidingWindow;

public class MaxSubarrayK {

   static void slidingWindowMaximum(int a[], int n, int k) {
       // Iterate from i=0 to i = n-k
       for (int i = 0; i <= n - k; i++) {
           // Intialize a variable 'max',
           // with a very samll value/
           int max = -999;

           // Iterate for the window of size 'k', starting from 'i'.
           for (int j = i; j < i + k; j++) {
               // If a[j] is greater than max,
               // update it.
               if (a[j] > max)
                   max = a[j];
           }
           // Print the maximum element found
           // in this window.
           System.out.print(max + " ");
       }
   }


       public static void main (String[]args){
           int arr[] = {1, 2, 3, 4};
           slidingWindowMaximum(arr, 4, 3);

       }
   }

