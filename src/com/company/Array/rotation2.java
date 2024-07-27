package com.company.Array;
//OPTIMISED APPROACH
public class rotation2 {
    static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    static void rotation(int arr[], int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
        }


        public static void main (String[]args){
            int arr[] = {1, 2, 3, 4, 5};
            rotation(arr, -1);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

//For clockwise rotate to right k times
//  reverse(nums,0,n-k-1);
//  reverse(nums,n-k,n-1);
//  reverse(nums,0,n-1);