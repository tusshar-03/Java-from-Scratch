import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int A = sc.nextInt();
        int B = sc.nextInt();
        int LargestOfTwo = (A>B)?A:B;      // ?->then , :->else
        System.err.println("LargestOfTwo = "+LargestOfTwo);
    }
}
