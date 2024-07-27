package PatternsQ;

public class CountgiveNumber {

    public static int firstOccurences(int arr[],int target){
        int ans1=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans1=mid;
                end=mid-1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
           else{
               start=mid+1;
            }
        }


        return ans1;
    }



    public static int LastOccurences(int arr[],int target){
        int ans2=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans2=mid;
                start=mid+1;
            }
            else if(target>arr[mid])
            {start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return ans2;
    }

    public static int count(int arr[], int target) {
        int result1 = firstOccurences(arr, target);
        int result2 = LastOccurences(arr, target);
        if (result1 != -1 && result2 != -1) {
            return result2 - result1 + 1;
        }
        return 0; // return 0 if the target is not found
    }








    public static void main(String[] args) {

        int arr[]={1,1,1,1,1,1,1};
        //int result1=firstOccurences(arr,2);
        //int result2=LastOccurences(arr,2);
        int result=count(arr,2);
        //System.out.println(result1);
        //System.out.println(result2);
        System.out.println(result);
    }


}
