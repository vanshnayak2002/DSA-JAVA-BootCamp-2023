package Matrics;
import java.util.Scanner;
public class Searching {

//it is not efficient sice it take all items to check
static boolean search(int matrix[][],int N,int target){
    for (int row = 0; row < N; row++) {
        for (int col = 0; col <matrix[row].length ; col++) {
            if(target==matrix[row][col]){
                return true;
            }
        }
    }

    return false;
}




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int matrix[][]= new int[N][M];
        for (int row = 0; row <N ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                matrix[row][col]= sc.nextInt();
            }
        }

        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    boolean ans=search(matrix,N,3);
        System.out.println(ans);
}

}
