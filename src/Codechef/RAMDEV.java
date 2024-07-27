
package Codechef;
import java.util.Scanner;

public class RAMDEV {
    public static void main(String[] args) {

        {
            Scanner sc=new Scanner(System.in);
            int l=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int ans=0;
            for(int i=0;i<n;i++){
                int L=sc.nextInt();
                int B=sc.nextInt();
                ans+=Math.max((L/l)*(B/b),(L/b)*(B/l));

            }
            System.out.println(ans);

        }
    }
}
