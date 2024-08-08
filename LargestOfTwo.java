import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.err.println("A = "+A);
        System.err.println("B = "+B);
        if (A>B) {
            System.err.println("A is greatest");
            
        } else{
            System.err.println("B is greatest");
        }
    }
}
