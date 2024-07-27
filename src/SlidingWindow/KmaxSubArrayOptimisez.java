package SlidingWindow;

public class KmaxSubArrayOptimisez {


    static int Subrosa(int arr[],int K,int N) {
        if (N < K) return -1;
        int i = 0, j = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum = sum + arr[j];
            if ((j - i + 1) < K) {
                j++;
            } else if (j - i + 1 == K) {
                max_sum = Math.max(max_sum, sum);
                sum =sum- arr[i];
                i++;
                j++;

            }
        }
        return max_sum;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int ans=Subrosa(arr,1,7);
        System.out.println(ans);
    }

}