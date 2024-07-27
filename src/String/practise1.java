package String;

public class practise1 {

    static void reverse(String S){
        for (int i = S.length()-1; i >=0 ; i--) {
            System.out.print(S.charAt(i));
        }
    }


    public static void main(String[] args) {
        String S="vansh nayak";
        reverse(S);
    }
}
