package com.company.Array;

import java.util.Arrays;

public class kthsmallest {
    static int kthsmallest(int arr[], int size, int k) {
        Arrays.sort(arr);
     return arr[k-1];
        }

    public static void main(String[] args) {
        int arr[]={2,6,5,4,1,2,3}; //1,2,3,4,5,6
        int size=arr.length;
        int ans=kthsmallest(arr,6,3);
        System.out.println(ans);


    }

}
