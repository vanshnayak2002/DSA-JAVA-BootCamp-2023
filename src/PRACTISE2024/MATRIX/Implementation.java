package PRACTISE2024.MATRIX;

import java.util.Scanner;

public class Implementation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M= sc.nextInt();
        int arr[][]=new int[N][M];
//INPUT
        for (int row = 0; row <N ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= sc.nextInt();
            }

        }

  //PRINT // arr.length==row ki length

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }


    }
}
