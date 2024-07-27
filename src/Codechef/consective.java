package Codechef;
import java.util.*;
public class consective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            ArrayList a = new ArrayList();
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < 2; j++)
                    if (S.charAt(j) == '0' || S.charAt(j + 1) == '1') {
                        a.add(0);
                    } else {
                        a.add(1);
                    }

                a.add(2);

            }

            System.out.println(a);
        }
    }
}


