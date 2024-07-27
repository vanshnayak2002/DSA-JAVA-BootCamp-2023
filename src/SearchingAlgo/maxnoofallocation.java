package SearchingAlgo;

public class maxnoofallocation {
    static int max(int arr[],int N){
        int max=0;
        for (int i = 0; i <N ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
      }
        return max;
    }

    static int sum(int arr[],int N){
        int sum=0;
        for (int i = 0; i <N ; i++) {
            sum=sum+arr[i];
        }
    return sum;
    }
    static boolean isValid(int arr[],int N,int mx,int K){
        int student=1; //behave as count
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            if(sum>mx){
                student++;
                sum=arr[i]; // dikakt
            }
            if(student>K){
                return false;
            }
        }
    return true;
    }

    static int Allocation(int arr[],int N,int K){
        int start=max(arr,N);
        int end=sum(arr,N);
        int res=-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, N, mid, K) == true) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
   return res;
    }

    public static void main(String[] args) {
    int arr[]={10,20,30,40};
    int N= arr.length;
    int ans=Allocation(arr,4,2);
        System.out.println(ans);
    }

}
