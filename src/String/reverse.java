package String;

public class reverse {
   static void String(String chars){
       StringBuffer sb=new StringBuffer(String.valueOf(chars));
       sb.reverse();
       System.out.println(sb);
   }

    public static void main(String[] args) {
        String chars ="Hello";
        String(chars);
    }
}
