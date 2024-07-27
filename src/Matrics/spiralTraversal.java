package Matrics;

import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc=arr[0].length-1;
        int tnt=n*m;
        int cnt=0;
        while (cnt<tnt){
            //left line
            for (int i = minr,j=minc; i<=maxr && cnt<tnt; i++) {
                System.out.println(arr[i][j]);
            cnt++;
            }
          minc++;
        //bottom line
            for (int i = maxr,j=minc; j <=maxc&& cnt<tnt ; j++) {
                System.out.println(arr[i][j]);
            cnt++;
            }
            maxr--;

          //right wall
            for (int i = maxr,j=maxc; i >=minr&& cnt<tnt ; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            //top wall
            for (int i = minr,j=maxc; j >=minc&& cnt<tnt ; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }

    }


}
