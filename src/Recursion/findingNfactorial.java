package Recursion;

public class findingNfactorial {

    static int factorail(int n){
        if(n<=0){

            return 1;
        }
        int fans=n*factorail(n-1);

    return fans;
    }

    public static void main(String[] args) {
        factorail(5);
        System.out.println(factorail(-27));
    }





}
