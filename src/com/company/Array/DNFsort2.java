package com.company.Array;



//{1,2,2,0,1,2}
//{0,1,1,2,2,2
public class DNFsort2 {


    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void dnfbabu(int arr[],int low,int mid,int high){
        while (mid<=high){
            if(arr[mid]==0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
               else if(arr[mid]==1){
                    mid++;
                }
                else {
                    swap(arr,mid,high);
                    high--;
                }
            }
        }



    public static void main(String[] args) {

        int arr[]={1,2,2,0,1,2};
        dnfbabu(arr,0,0, arr.length-1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        }

    }

