package Matrics;

public class counting1MaxOptimized {

    static int lowerBound(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int counting1Max(int matrix[][], int N) {
        int ind = -1;
        int max_count = 0;
        for (int row = 0; row < N; row++) {
            int count_col = N - lowerBound(matrix[row], 4, 1);
            if (count_col > max_count) {
                max_count = count_col;
                ind = row;
            }
        }
        return ind;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0},
                {0, 1, 1, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 1}
        };

        int ans = counting1Max(matrix, 4);
        System.out.println(ans);
    }
}
