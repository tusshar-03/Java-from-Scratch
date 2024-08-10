import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        int A = sc.nextInt();
        System.out.println("B = ");
        int B = sc.nextInt();
        System.out.println("opertor = ");
        char opertor = sc.next().charAt(0);

        switch (opertor) {
            case '+': System.out.println(A+B);
                break;
            case '-': System.out.println(A-B);
                break;
            case '*': System.out.println(A*B);
                break;
            case '/': System.out.println(A/B);
                break;
            default : System.out.println("Wrong Ans");
        }
    }
}
