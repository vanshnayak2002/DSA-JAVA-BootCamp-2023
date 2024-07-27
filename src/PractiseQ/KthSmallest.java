package PractiseQ;

import java.util.Arrays;

//find k times smallest no
public class KthSmallest {
    public static void main(String[] args) {
        int arr[]={70,4,6,1,9,8,55,78,98,2,45,65,78,56,34,90,100};
        int ans=ksmall(arr,17,6);
        System.out.println(ans);

    }
    public static int ksmall(int arr[],int N,int K){
        Arrays.sort(arr);
        return arr[N-K];


        }


    }


