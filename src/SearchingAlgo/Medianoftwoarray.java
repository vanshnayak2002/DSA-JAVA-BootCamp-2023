package SearchingAlgo;

public class Medianoftwoarray {

    static int[] adding(int nums1[],int nums2[]){
        int n1= nums1.length;
        int n2= nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[n1+n2];
        while( i<n1 && j<n2){
         if(nums1[i]<nums2[j]){
             arr[k++]=nums1[i++];
         }
         else{
             arr[k++]=nums2[j++];
         }
        }

    while (i<n1){
        arr[k++]=nums1[i++];
    }
    while(j<n2){
        arr[k++]=nums2[j++];
    }

    return arr;
    }



    public static void main(String[] args) {
    int nums1[]={1,2,3};
    int nums2[]={4,5};
    int []merge=adding(nums1,nums2);
        for (int i = 0; i < merge.length ; i++) {


        System.out.println(merge[i]);}
    //{1,2,3,4,5};OUTPUT
    }
}
