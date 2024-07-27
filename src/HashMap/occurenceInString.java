package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class occurenceInString {

    public static void main(String[] args) {

    String S="H20";
        HashMap<Character,Integer>mp=new HashMap();
        for (char c:S.toCharArray() ) {
            mp.put(c, mp.getOrDefault(c,0)+1);

        }

        System.out.println(mp);
    }
}



