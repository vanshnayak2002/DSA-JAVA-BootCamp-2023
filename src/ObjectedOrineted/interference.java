package ObjectedOrineted;

interface MyInterfernce{
  void system();
  int calculate(int x,int y);
  default void rog(){
      System.out.println("ROG");
  }

}

interface MyInterference2 extends MyInterfernce{
 void hindu();
}

class Myclass implements MyInterference2{
    public  void system(){
        System.out.println("Systemm!!");
    }
    public int calculate(int x,int y){
        return x+y;
    }
    public void hindu(){
        System.out.println("Jai Shree Ram!!");
    };
}



public class interference {
    public static void main(String[] args) {
     MyInterference2 reference  =new Myclass();
     reference.rog();
     int ans=reference.calculate(2,3);
     Myclass cs=new Myclass();
     cs.rog();
    }
}
