package Matrics;

import java.util.Scanner;

public class Matrixmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        int r2= sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int [r2][c2];
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Invalid");
            return;
        }
        int prod[][]=new int[r1][c2];
        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j < prod[i].length ; j++) {
                for (int k = 0; k <c1 ; k++) {
                    prod[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for (int i = 0; i < prod.length ; i++) {
            for (int j = 0; j <prod[i].length ; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }


}

/*


prod[0][0]=(1×2)+(2×1)=2+2=4
prod[0][1]=(1×0)+(2×2)=0+4=4
prod[1][0]=(3×2)+(4×1)=6+4=10
prod[1][1]=(3×0)+(4×2)=0+8=8

Summary
In the statement prod[i][j] += arr1[i][k] * arr2[k][j];:

arr1[i][k] selects an element from the current row of arr1.
arr2[k][j] selects an element from the current column of arr2.
Their product is added to the current value of prod[i][j], accumulating the result of the dot product of the
𝑖
i-th row of arr1 and the
𝑗
j-th column of arr2.
This process is repeated for each element in the resulting matrix prod.
 */
