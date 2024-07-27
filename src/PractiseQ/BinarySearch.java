package PractiseQ;

import java.sql.Array;
import java.util.Scanner;

public class BinarySearch {

    static  int Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+end-start/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        else {
            start=mid+1;
            }
        }
return -1;
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,6,7,8,9,10,11};
        int ans= Search(arr,55);
        System.out.println(ans);

    }

}
