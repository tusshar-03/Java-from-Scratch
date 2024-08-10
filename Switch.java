import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int num = sc.nextInt();
        switch (num) {
            case 1: System.out.println("A");
            break;
            case 2: System.out.println("B");
            break;
            case 3: System.out.println("C");
            break;
            default: System.out.println("ABC");
            
        }
    }
}
