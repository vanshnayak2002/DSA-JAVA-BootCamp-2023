package ObjectedOrineted;


class Animal{
    void message(){
        System.out.println("This is dog");
    }
}
class dog extends Animal{
    void message1(){
        System.out.println("bark");
    }
}





public class inheritanceharry {
    public static void main(String[] args) {
        dog b=new dog();
        b.message();
    }
}
