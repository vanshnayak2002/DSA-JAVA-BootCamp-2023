package com.company.Array;

public class peekelement {

    static void peekElement(int[]arr,int n){

        for (int i = 1; i < n-1 ; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]){
                System.out.println(arr[i]);
            }

        }

    }


    public static void main(String[] args) {
        int arr[]={10, 20, 15, 2, 23, 90, 67};
        peekElement(arr,7);
    }

}
