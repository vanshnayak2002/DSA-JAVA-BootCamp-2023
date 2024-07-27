package SearchingAlgo;

public class countelement {
    static int FirstOccurence(int arr[],int ele){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+end-start/2;
            if(ele==arr[mid]){
                result=mid;
                end=mid-1;
            }
            else if (ele<arr[mid]){
                end=mid-1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    static int LastOccurence(int arr[],int ele){
        int start=0;
        int end=arr.length-1;
        int result1=-1;
        while (start<=end){
            int mid=start+end-start/2;
            if(ele==arr[mid]) {
                result1=mid;
                start=mid+1;
            }
            else if(ele<arr[mid]){
                end=mid-1;
            }
            else{
                end=mid-1;
            }
        }
    return result1;
    }
   static int count(int arr[],int ele){
        int count=LastOccurence( arr, 3)-FirstOccurence(arr,3)+1;
        return count;
   }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,5,6};
        System.out.println(FirstOccurence(arr,3));
        System.out.println(LastOccurence(arr,3));
        System.out.println(count(arr,3));
    }
}
