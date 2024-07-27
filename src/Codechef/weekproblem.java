package Codechef;
import java.util.*;
import java.lang.*;
import java.io.*;


public class weekproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []weeklypractise= new int[4];
        int ans=0;
        for (int i = 0; i <4 ; i++) {
            weeklypractise[i]= sc.nextInt();
            if(weeklypractise[i]>=10)
                ans++;
        }
        System.out.println(ans);
        }

    }

