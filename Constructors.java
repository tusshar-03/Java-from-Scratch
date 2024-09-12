public class Constructors {
    public static void main(String[] args) {
        Student s1= new Student();
        //System.out.println(S1.name);
        // Student s2= new Student("ABCD");
        // Student s3=new Student(123);
        s1.name="userXYZ";
        s1.roll = 456;
        s1.password="abcd";

        Student s2=new Student(s1);
        s2.password="xyz";
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){
        System.out.println("Constructor is called..");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
