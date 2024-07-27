package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorted {
     static void findduplicate(String str){
         char[] chars = str.toCharArray();
         Arrays.sort(chars);
         String sortedStr = new String(chars);
         System.out.println(sortedStr);


     }

    public static void main(String[] args) {
     String str="vansh nayak";
     findduplicate(str);
    }

}
