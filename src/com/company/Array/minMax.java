package com.company.Array;

public class minMax {

    public static void main(String[] args) {
        int arr[]={12,30,2,34,67,99};
         int max=arr[0];
         int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min) {
                 min=arr[i];
            }
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println("maximum is" +  min + "Minimum is"  +  max);
        }
    }
