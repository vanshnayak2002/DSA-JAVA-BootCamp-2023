package Matrics;

public class BinarySearchonSorted2D {

    static boolean BinarySearch1D(int[] arr, int N, int target) {
        int low = 0;
        int high = N - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    static boolean Search2Dto1D(int arr[][], int N, int M, int target) {
        int low = 0;
        int high = N * M - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            int row = mid / M;
            int col = mid % M;
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    static int[] Search2Dto1DreturnIndex(int[][] arr, int N, int M, int target) {
        int low = 0;
        int high = N * M - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / M;
            int col = mid % M;  // Corrected col calculation
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1, -1};  // Return -1, -1 if the target is not found
    }


    static boolean MatrixSearch(int[][] matrix, int N, int target) {

        for (int row = 0; row < N; row++) {
            if (matrix[row][0] <= target && target <= matrix[row][N - 1]) {
                if (BinarySearch1D(matrix[row], N, target)) {
                    return true;
                }
                ;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

//boolean found=  MatrixSearch(matrix,3,11);
        // System.out.println(found);

       /* int target = 6;
        boolean found2 = Search2Dto1D(matrix, 3, 3, target);
        System.out.println("Target " + target + " found: " + found2);

        target = 11;
        found2 = Search2Dto1D(matrix, 3, 3, target);
        System.out.println("Target " + target + " found: " + found2);
*/

        int target2 = 6;
        int[] result = Search2Dto1DreturnIndex(matrix, 3, 3, target2);
        if (result[0] != -1) {
            System.out.println("Target " + target2 + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target2 + " not found.");
        }

        target2 = 11;
        result = Search2Dto1DreturnIndex(matrix, 3, 3, target2);
        if (result[0] != -1) {
            System.out.println("Target " + target2 + " found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target " + target2 + " not found.");
        }

    }


}




















