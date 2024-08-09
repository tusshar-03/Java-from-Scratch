import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int Income = sc.nextInt();
        int Tax;
        if (Income<500000) {
            System.err.println("Tax = 0");
        }
        else if (Income>=50000 && Income<1000000) {
            System.err.println("Tax = "+(Income*0.2));
        }
        else{
            System.err.println("Tax = "+(Income*0.3)); 
        }
    }
}
