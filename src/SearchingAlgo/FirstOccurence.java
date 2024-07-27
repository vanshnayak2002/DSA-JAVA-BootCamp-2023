package SearchingAlgo;

public class FirstOccurence {

   static int FirstOccurence(int []arr,int start,int end ,int ele){
       int result=-1;
       while (start<=end){
           int mid=start+end-start/2;
           if(ele==arr[mid])
           {
               result=mid;//doubt clearence is must;
               end = mid - 1;//for last occuence do start=mid+1; baki sam same
           }
               else if(ele<arr[mid]){
                   end=mid-1;
               }
            else{
                end=mid+1;
       }
       }
   return result;
   }



    public static void main(String[] args) {
        int arr[]={2,4,10,10,10,18,20};
        System.out.println(FirstOccurence(arr,0,6,10));
   }
}
