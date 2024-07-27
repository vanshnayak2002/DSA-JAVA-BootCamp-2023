package ObjectedOrineted;

class cellphone{
    void call(){
        System.out.println("Calling");
    }
    void ring(){
        System.out.println("Rining");
    }

    void balance(){}
}
interface mycamera{
    void takeshot();
    void recorder();
    default void recordin4K(){
       System.out.println("Recording in 4K");
   }
}

interface myBluetooth{
    String port[]=new String[10];
    void scan();
    void connect(String port);
}

class MySmartPhone extends cellphone implements mycamera,myBluetooth{
    public void call(){
    }
    public void ring(){}
    public void takeshot(){}
    public void recorder(){}
    public void scan(){}
   public void recordin4K(){
        System.out.println("Recording in 4K and Turning off Bluetooth");
    }
    public void connect(String port){
        System.out.println("Connecting to the port" + " " + port);
    }



}

public class Inference {
    public static void main(String[] args) {
      MySmartPhone ms=new MySmartPhone();
      ms.connect("12334");
      ms.recordin4K();
    }
}
