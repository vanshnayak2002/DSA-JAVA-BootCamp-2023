package Recursion;

public class sortedArray {

    static boolean sorted(int arr[],int  idx){
        if(arr[idx]== arr.length-1){
            return true;
        }
        return arr[idx]<arr[idx+1] && sorted(arr,idx+1);
    }



    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        if(sorted(arr,0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
