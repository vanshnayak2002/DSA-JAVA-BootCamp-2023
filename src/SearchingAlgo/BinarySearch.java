package SearchingAlgo;
//Binary Search on simple sorted array
public class BinarySearch {

        static int BinarySearch(int []arr,int start,int end,int ele){
          while(start<=end){
            int mid=start+end-start/2;
            if(ele==arr[mid]){
              return mid;
            }
          else if(ele<arr[mid]){
            end=mid-1;
            }
          else{
          start=mid+1;
          }
          }
          return -1;
        }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
   int result=BinarySearch(arr,0,9,3);
    System.out.println(result);
        }

}
