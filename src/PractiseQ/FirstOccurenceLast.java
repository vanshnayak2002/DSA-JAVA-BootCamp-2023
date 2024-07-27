package PractiseQ;

public class FirstOccurenceLast {

    static void occurenceElement(int arr[],int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + high - low / 2;
            if (target == arr[mid]) {
                res = mid;
                high = mid - 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       // return res;
    }
        static int lastoccurenceElement(int arr[],int target) {
            int low = 0;
            int high = arr.length - 1;
            int res=-1;
            while (low <= high) {
                int mid = low + high - low / 2;
                if (target == arr[mid]) {
                    res= mid;
                    low = mid + 1;
                } else if (target < arr[mid]) {
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            return res;

    }



    public  static int[] searchRange(int[] arr, int target) {
        int res[]=new int[]{-1,-1};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= end+start-end/2;
            if(target==arr[mid]){
                res[0]=mid;
                end=mid-1;        }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }

        while(start<=end){
            int mid= end+start-end/2;
            if(target==arr[mid]){

                res[1]=mid;
                start=mid+1;        }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;

            }


        }
        return res;
    }



    public static void main(String[] args) {
        int arr[]={2,4,10,10,10,16,20};
        int target=10;
        //int ans=occurenceElement(arr,target);
        //System.out.println("Fist Ocuurence is:"+ans);
        //System.out.println("Last Occurence is "+lastoccurenceElement(arr,target));
        //TC is O(Log n)
    int[] anns=searchRange(arr,target);
        System.out.println(anns);
    }
}
