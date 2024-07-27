package com.company.Array;

public class firstnlast {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,5};
        element(arr,3);
    }
  static void element(int arr[],int x){
        int first=-1,last=-1;
        for (int i = 0; i <arr.length ; i++) {
          if(x!=arr[i])
             continue;
             if(first==-1)
                 first = i;
                 last = i;
             }
        if(last!=-1)
              System.out.println(+first);
      System.out.println(+last);
          }
      }

