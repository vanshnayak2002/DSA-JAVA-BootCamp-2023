package Recursion;

public class printallarray {

    static void printarry(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printarry(arr, idx + 1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printarry(arr,0);
        }

    }




