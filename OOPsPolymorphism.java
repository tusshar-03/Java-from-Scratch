public class OOPsPolymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(5, 2));

        Animal d=new Deer();  
        d.eats();
    }  
}
//overriding
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}

//overloading polymorphism
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}
