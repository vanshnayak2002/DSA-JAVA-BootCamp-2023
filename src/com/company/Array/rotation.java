package com.company.Array;

public class rotation {

    static void rotate(int arr[]){
       int temp= arr[0];
        for (int i = 1; i < arr.length ; i++) {
            //temp=arr[i];
            arr[i-1]=arr[i];
            //arr[i+k]=temp;

        }
        arr[arr.length-1]=temp;
    }


    public static void main(String[] args) {
  int arr[]={1,2,3,4,5};
  rotate(arr);
  rotate(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
