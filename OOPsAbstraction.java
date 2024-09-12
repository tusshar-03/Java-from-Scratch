public class OOPsAbstraction {
    public static void main(String[] args) {
        Horse H=new Horse();
        H.eats();
        H.walk();

        Chicken c=new Chicken();
        c.eats();
        c.walk();

        System.out.println(H.color);
        H.changecolor();
        System.out.println(H.color);

        //interfac e
        Queen q = new Queen();
        q.moves();
    }
}
//iterfaces
interface ChessPlayer{
    void moves();

}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right diagonal");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up down left right diagonal(By1step)");
    }
}

//Abstraction
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eats(){
        System.out.println("animal eats");
    }    

    abstract void walk();
}
class Horse extends Animal{
    void changecolor(){
        color="White";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
