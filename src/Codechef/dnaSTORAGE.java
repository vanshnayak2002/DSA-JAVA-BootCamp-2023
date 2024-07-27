
package Codechef;
import java.util.Scanner;
public class dnaSTORAGE {
    public static void main(String[] args) {




        Scanner sc=new Scanner(System.in);

        int t= sc.nextInt(); //test cases


        while(t-- >0){
            String S=sc.next();
            String T=sc.next();

            StringBuilder sb=new StringBuilder();
            for(int i=0;i<5;i++){
                if(S.charAt(i)==T.charAt(i)){
                    sb.append("B");
                }
                else{
                    sb.append("G");
                }

            }
            System.out.println(sb);
        }

    }
}



//00 is replaced with A
//01 is replaced with T
//10 is replaced with C
//11 is replaced with G