package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

        public static HashMap<Character,Integer>makefreqmap(String str){
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int i=0;i<str.length();i++){
                Character ch=str.charAt(i);

                if(!mp.containsKey(ch)){
                    mp.put(ch,1);
                }
                else{
                    mp.put(ch,mp.get(ch)+1);
                }

            }

            return mp;

        }


        public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            HashMap<Character,Integer> mp1=makefreqmap(s);
            HashMap<Character,Integer>mp2=makefreqmap(t);
            return mp1.equals(mp2);
        }


        static boolean anagram(char[]str1 ,char[]str2){
if(str1.length!=str2.length){
    return false;
}
    for (int i = 0; i < str1.length ; i++)
        if (str1[i] != str2[i])
            return false;

        return true;
}





public static void main(String[] args) {

        char[] str1={'s','i','l','e','n','t'};
        char[] str2={'l','i','s','v','e','n'};
        String s="silent";
        String t="listen";
       boolean ans= isAnagram(s,t);
    System.out.println(ans);
       Arrays.sort(str1);
        Arrays.sort(str2);
       //boolean ans= anagram(str1,str2);
       // System.out.println(ans);


        }
    }


