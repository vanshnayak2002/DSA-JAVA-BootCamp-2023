package ObjectedOrineted;

abstract class Parent2{
    public abstract void message();

}
class sub1 extends Parent2{
     public void message(){
        System.out.println("This is first subclass");
    }
}
class  sub2 extends Parent2{
      public void message(){
        System.out.println("This is Second Subclass");
    }
}




public class abstractionQ1 {

    public static void main(String[] args) {
        Parent2 obj1=new sub1();
        Parent2 obj2=new sub2();

        obj1.message();
        obj2.message();

    }
}
