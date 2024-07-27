package PRACTISE2024.ARRAY;

import java.util.*;

public class KthMAX_MIN {

    static int maxi(int arr[],int k){
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        int n=arr.length;
        max=arr[n-k];
        return max;
    }

    //optimised using hashing it will take NlogK times. where k is size
  static int kmin(int arr[],int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

      for (int i=0;i< arr.length;i++) {
          pq.add(arr[i]);
          if (pq.size() > k) {
              pq.poll();
          }
      }
      return pq.peek();


  }
    public static void main(String[] args) {
        int arr[]={ 3,4,7,10,15, 20};
        //int ans=maxi(arr,2);
        int ans=kmin(arr,3);
        System.out.println(ans);
    }

}
