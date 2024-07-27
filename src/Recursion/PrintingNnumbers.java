package Recursion;

public class PrintingNnumbers {


    static void printnumbers(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printnumbers(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        printnumbers(4);


    }


}


