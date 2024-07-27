package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FirstNegativeFromSubaray {

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int N = arr.length;
        //FirstNegative(arr,5,3);
        int[] ans=negativenuber(arr,8,3);
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }


    }

    static int[] negativenuber(int arr[], int N, int K) {
        int i = 0, j = 0;
        Queue<Integer> l = new LinkedList<>();
        int result[] = new int[N - K + 1];
        int idx = 0;

        while (j < N) {
            if (arr[j] < 0) {
                l.add(arr[j]);
            }

            if (j - i + 1 == K) {
                if (l.size() == 0) {
                    result[idx++] = 0;
                } else {
                    result[idx++] = l.peek();
                    if (arr[i] == l.peek()) {
                        l.poll();
                    }
                }

                i++;
            }
             j++;
        }

        return result;
    }


    public static void calculate(int n,int[] arr, int k){
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (j < n) {
            if (arr[j] < 0)
                list.add(arr[j]);
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                if(list.size() == 0)
                    System.out.print("0 ");
                else {
                    System.out.print(list.get(0)+" ");
                    if(arr[i] == list.get(0)) {
                        list.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println();
    }
}











