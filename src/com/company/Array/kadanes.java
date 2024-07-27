package com.company.Array;

public class kadanes {

  static int subarray(int arr[],int n){
      int MaxSum=arr[0];
      int CurrSum=0;
      for (int i = 0; i <n ; i++) {

              CurrSum = CurrSum + arr[i];

               if(CurrSum>MaxSum){
                  MaxSum=CurrSum;
              }
              if (CurrSum<0){
                  CurrSum=0;
              }
          }

  return MaxSum;
  }

    public static void main(String[] args) {
        int arr[]={-5,7,8,5,6,-3,4,-1,8};
        int n= arr.length;

       int ans=subarray(arr,9);
        System.out.println(ans);
    }
}
