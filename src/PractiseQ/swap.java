package PractiseQ;

public class swap {

   static void swap(int a,int b){
       int temp=a;
       a=b;
       b=temp;
       System.out.println(a);
       System.out.println(b);
   }

    public static void main(String[] args) {
       swap(2,3);

    }

}
