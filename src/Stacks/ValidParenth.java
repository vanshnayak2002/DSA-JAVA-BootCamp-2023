package Stacks;

import java.util.Stack;

public class ValidParenth {  //((())

    static int removeBrackets(String s){
        int n= s.length();
        Stack<Character>st=new Stack<>();

        for (int i = 0; i <n ; i++) {
            char ch = s.charAt(i);
            if(ch=='('){
               st.push(ch);
            }

            else{
                if(st.isEmpty()){
                    return -1;

                }
                char gh =st.pop();
                 if(ch==')' && gh=='('){
                     st.remove(gh);
                     st.remove(ch);
                 }
            }
        }
return  st.size();
    }


    public static void main(String[] args) {
        String s="(()())";
        int ans=removeBrackets(s);
        System.out.println(s);
    }

}
