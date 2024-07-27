package com.company.Array;

public class printsubarray {
    static void subarray(int[]arr){
     // int maxsum=0;
      int n=arr.length;
      for (int i = 0; i <n ; i++) {
        for (int j = i; j <n ; j++) {
          for (int k=i; k<=j; k++){
            System.out.println(" "+arr[k]+" ");
          }
          System.out.println();
        }
      }
    }

  public static void main(String[] args) {
    int arr[]={-5,4,6,-3,4,-1};
    subarray(arr);
  }
}
