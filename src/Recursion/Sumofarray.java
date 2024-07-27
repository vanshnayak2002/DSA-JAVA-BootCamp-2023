package Recursion;

public class Sumofarray {

    static int sum(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        int smallsum=sum(arr,idx+1);
                int sum=smallsum+arr[idx];//this arr[idx] is not associated with above if condition


        return sum;
    }




    public static void main(String[] args) {
        int arr[]={2,2,2,2,2,2,2,2,2,2};
        int lol=sum(arr,0);
        System.out.println(lol);
    }
}
