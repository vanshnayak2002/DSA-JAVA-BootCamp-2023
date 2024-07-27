package PatternsQ;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + end - start / 2;
            if (target==arr[mid]) {

                return mid;
            } else if (target > arr[mid]) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        int result=binarySearch(arr,55);
        System.out.println(result);
    }


}