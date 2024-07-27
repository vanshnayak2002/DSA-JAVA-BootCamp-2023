package SearchingAlgo;

public class SearchI_in_Roated_Sorted {

    static int Search(int arr[],int start,int end,int N,int target){
        if(N==1 && target==arr[0]){
            return 0;
        }
        else if(N==1 && target!=arr[0]){
            return -1;
        }
        else
        while(start<=end){
            int mid=start+end-start/2;
            if(target==arr[mid]){
                return mid;

            }

            else if(arr[start]<arr[mid]){
                if(arr[start]<=target && target<=arr[mid]) {
                    end = mid - 1;
                }
                    else{
                        start=mid+1;
                    }
                }

                else
                    if(arr[mid]<=target&& target<=arr[end]){
                        start=mid+1;}
                        else{
                            end=mid-1;
                        }
                }
    return -1;
    }




    public static void main(String[] args) {

    int arr[]={7,8,9,1,2,3,4,5,6};
        System.out.println(Search(arr,0,8,5,2));


    }
}
