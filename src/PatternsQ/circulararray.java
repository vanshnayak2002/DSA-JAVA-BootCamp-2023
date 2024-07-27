package PatternsQ;

public class circulararray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i % n]); // This will print array elements in a circular manner
        }
    }
}
