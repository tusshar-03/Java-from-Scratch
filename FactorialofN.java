import java.util.Scanner;

public class FactorialofN {

    public static int Factorials(int n){
        int f = 1;

        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fact=Factorials(n);
        System.out.println("Factorials of n = "+Factorials(n));
    }
}