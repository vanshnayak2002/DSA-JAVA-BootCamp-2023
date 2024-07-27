package ObjectedOrineted;

abstract class parent {
    public  parent(){
        System.out.println("i am constructor of parent class");
    }
    public void greet(){
        System.out.println("Good Morning");
    };

   abstract public void sayHello();


}
 class child extends parent {
     public void sayHello(){
         System.out.println("heelo");
     }
    }

public class Abstrack {
    public static void main(String[] args) {

    }

}
