package Recursion;

public class StringOccurence {



    static String removeA(String s,int idx){
        if(idx==s.length()) {
            return "";
        }
        String smallAns=removeA(s,idx+1);
         char curchar=s.charAt(idx);

         if(curchar!='a'){
         return curchar+smallAns;}
        else{
         return smallAns;
        }



    }

    public static void main(String[] args) {
        String s="abba";
        removeA( s,0);
        System.out.println(removeA(s,0));
    }

}
