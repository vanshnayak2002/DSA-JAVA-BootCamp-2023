package com.company.Array;

public class pallindrome {
    static boolean palindrome(String str){
      String rev="";
        for (int i = str.length()-1; i>=0 ; i--) {
            rev=rev+str.charAt(i);
        }
     if(str.equals(rev)) {
         System.out.println("True");
         return true;
     }
     else {
         System.out.println("false");
     };
    return false;
    }


    public static void main(String[] args) {
    String str="abcab";
    palindrome(str);
    }

}
