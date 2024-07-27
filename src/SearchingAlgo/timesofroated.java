package SearchingAlgo;

public class timesofroated {

    public static int timesOFRoatation(int arr[],int start,int end,int N){

        while (start<=end){
        int mid=start+end-start/2;
        int next=(mid+1)%N;
        int prev=(mid+N-1)%N;

        if(arr[mid]<=arr[next]  && arr[mid]<=arr[prev] ){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            start=mid+1;
        }
        else if(arr[mid]<=arr[end]){
            end=mid-1;
        }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[]={7, 9, 11, 12, 5};//
        System.out.println(timesOFRoatation(arr,0,4,5));

    }
}
