package Matrics;

public class counting1Max {

    static int minRowIndex(int matrix[][], int N) {
        int ind = -1;
        int max_count = -1;
        for (int row = 0; row < N; row++) {
            int count_row = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                count_row += matrix[row][col];
            }
            if (count_row > max_count) {
                max_count = count_row;
                ind = row;
            }
        }
        return ind;
    }


    public static void main(String[] args) {
        //entire row sorted
        //it takes NXM complextuty
        // then to optimized this we can search for binary serah

        int[][] matrix = {
                {1, 1, 1, 1},
                {0, 0, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 1}
        };

        int ans = minRowIndex(matrix, 4);
        System.out.println(ans);
    }
}
