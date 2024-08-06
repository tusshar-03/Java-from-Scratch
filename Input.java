import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //String input = sc.next(); //stores input
        //System.out.println(input); //print input

        String name = sc.nextLine(); //To Store full name
        System.out.println(name);


        int num = sc.nextInt(); //to store int value
        System.out.println(num);

        float price = sc.nextFloat(); //for float value store
        System.out.println(price);
    }
    
}
