package PRACTISE2024;
class ArrayREVERSE{

    static void reverse(int arr[]){
        int size= arr.length;

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 10, 10, 11, 12};
        reverse(arr);

    }


}