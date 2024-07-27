package com.company.Array;

public class Merge2Sorted {


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int index=0;
        for(int i =0;i<nums1.length;i++) {
            int start = nums2[index];
            if (nums1[i] == 0) {
                nums1[i] = start;
                index++;
            }


        }
    }


        public static void main(String[] args) {
         int nums1[] = {1,2,3,0,0,0}; int m = 3;
            int[] nums2 = {2,5,6}; int  n = 3;
        merge(nums1,m,nums2,n);
            System.out.println();


    }
}
