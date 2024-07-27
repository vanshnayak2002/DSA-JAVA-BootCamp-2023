package String;

import java.util.Arrays;

public class Duplicate {
    static void findduplicate(String str){
        int length=str.length();
        char[]chars=str.toCharArray();
        Arrays.sort(chars);
        String sortedstr=new String(chars) ;

        for (int i = 0; i <length ; i++) {
            int count=1;
          while (i<length-1 && sortedstr.charAt(i)==sortedstr.charAt(i+1)){
              count++;
              i++;
          }
            if (count > 1) {
                System.out.println(sortedstr.charAt(i)
                        + ", count = " + count);
            }
        }


    }




    public static void main(String[] args) {
        String str="abaab";
       findduplicate(str);
    }

}
