package String;

public class Stringrotation {

    static void rotation(String str1, String str2){
        if(str1.length()!=str2.length()){
            System.out.println("invalid");;
        }
          String strt3=str1+str1;
            if(strt3.indexOf(str2)!=-1){
                System.out.println("yes");
            }
            else
            System.out.println("no");
      }





    public static void main(String[] args) {
        String str1="abcd";
        String str2="cdab";
        rotation(str1,str2);
    }
}
