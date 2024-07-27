package ObjectedOrineted;

public class This {

    static  class Student{
        int rollno;
        String name;
        int marks;

    Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    void greeting(){
        System.out.println("Hello How are you!!"+this.name);
    }

    boolean changename(String newname, int newmarks, int newrollno){
        this.name=newname;
        this.rollno=newrollno;
        this.marks=newmarks;
        return false;
    }

    }




    public static void main(String[] args) {
        Student vansh=new Student(5909909,"vansh",9897);
        //vansh.changename("Priyam",45,500082893);
        vansh.greeting();
        System.out.println(vansh.marks);

    }
}
