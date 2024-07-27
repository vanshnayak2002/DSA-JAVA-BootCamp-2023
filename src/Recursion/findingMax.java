package Recursion;

public class findingMax {

    static int Max(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = Max(arr, idx + 1);
        int ans = Math.max(smallAns, arr[idx]);

        return ans;

    }


    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 23, 4, 5};

        int finall = Max(arr, 0);

        System.out.println(finall);
    }
}