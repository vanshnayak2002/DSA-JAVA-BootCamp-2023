package String;

public class Palindrom {

    static boolean isPalindrome(String s){


    String nstr="";
        for (int i = s.length()-1; i >=0; i--) {
            nstr=nstr+s.charAt(i);
        }
        if(nstr.equals(s)){
        return true;
        }
        else{
    return false;}
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean ans=isPalindrome(s);
        System.out.println(ans);
    }
}
