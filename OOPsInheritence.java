public class OOPsInheritence {
    public static void main(String[] args) {
        // Fish shark= new Fish();
        // shark.eats();
        Dog sheru = new Dog();
        sheru.legs=4;
        sheru.eats();
        System.out.println("Legs = "+sheru.legs);
    }
}
//base class
class Animal {
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Mammals extends Animal{
    int legs ;

}

class Dog extends Mammals{
    String barks;
}

//derived class
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims");
    }
}