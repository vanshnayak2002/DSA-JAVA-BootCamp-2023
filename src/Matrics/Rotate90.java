package Matrics;

// For rotation we have to perform transpose + reverse
public class Rotate90 {

    // Method to transpose the matrix
    static void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Method to reverse each row of the matrix
    static void reverseRows(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Method to rotate the matrix 90 degrees clockwise
    static void rotate90(int[][] matrix) {
        transpose(matrix);  // Step 1: Transpose the matrix
        reverseRows(matrix);  // Step 2: Reverse each row
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate90(arr);  // Rotate the matrix 90 degrees clockwise

        // Print the rotated matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
