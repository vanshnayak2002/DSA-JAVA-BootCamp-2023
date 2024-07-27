package com.company.Array;

public class subarray {

    static void subarray(int arr[],int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }

                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        subarray(arr,3);
    }

}
