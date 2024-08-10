import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int marks = sc.nextInt();
        String Result = marks>=33?"PASS":"FAIL";
        System.err.println(Result);
    }
}
