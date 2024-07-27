package PRACTISE2024.ARRAY;

public class ReverseArray {

    static void reverse2pointer(int start,int end,int arr[]){
        int size=arr.length;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }






    static void reverse(int arr[]){
        int size= arr.length;

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 10, 10, 11, 12};
       // reverse(arr);
        reverse2pointer(0,7,arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }

}
    /*Detailed Comparison

        Functionality:

        Initial Code: The initial code prints the elements of the array in reverse order but does not actually reverse the array itself. The array remains unchanged after the method execution.
        Two-Pointer Approach: This approach modifies the array in place by swapping elements, resulting in the array being reversed.
        Use Case:

        Initial Code: Suitable for scenarios where you only need to display the array elements in reverse order temporarily and do not need to alter the original array.
        Two-Pointer Approach: Appropriate when you need to reverse the array itself, modifying the original data structure.
        In-Place Modification:

        Initial Code: Does not modify the original array.
        Two-Pointer Approach: Modifies the original array in place.*/
