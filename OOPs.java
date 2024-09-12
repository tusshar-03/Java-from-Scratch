public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();//constructor
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.setColor("Yellow");
       // p1.color="Yellow";
        System.out.println(p1.getColor());

        BankAccount myAccount = new BankAccount();
        myAccount.username="ABC"; 
        System.out.println(myAccount.username);

        myAccount.setPassword("gfghj");
    } 
}

class BankAccount{
    public String username;
    private String Password; 
    public void setPassword(String pwd){
        Password=pwd;
    }
    
}

class Pen{
    //propertie and functions
    private String color;
    int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name ;
    int age;
    float percentage;//cgpa

    void marks(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;

    }
}