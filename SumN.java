import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (i<=N) { 
           sum = sum + i;
            i++;

        }
        System.out.println("Sum = "+sum);
    }
}
