package com.company.Array;

public class DNFsort {
     static void colorsort(int arr[],int n){
         int low=0;
         int high= arr.length-1;
         int mid=0;
         int temp;
         while (mid<=high){
             switch (arr[mid]){
                 case 0: {
                     temp = arr[low];
                     arr[low] = arr[mid];
                     arr[mid] = temp;
                     low++;
                     mid++;
                     break;
                 }
                 case 1:{
                     mid++;
                     break;
                 }
                 case 2:{
                     temp=arr[mid];
                     arr[mid]=arr[high];
                     arr[high]=temp;
                     high--;
                     break;
                 }
             }
         }

     }

    public static void main(String[] args) {
        int arr[]={0,1,2,0,0,2,2,2,0,0};
        colorsort(arr,5);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + "");
        }

     }
}
