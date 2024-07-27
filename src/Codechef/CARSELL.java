package Codechef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CARSELL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long ans=0;
            List<Long>arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextLong());
            }
            Collections.sort(arr);
            for(int i=n-1; i>=0; i--) {
                ans+=(Math.max((long)0, (long)(arr.get(i)-(n-i-1))));
            }
            ans%=1000000007;
            System.out.println(ans);
            t--;
        }
    }
}
