import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        if (N%2==0) {
            System.err.println("Even");
        } else{
            System.err.println("odd");
        }
    }
}



// import java.util.Scanner;

// public class OddEven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         for(int i=1;i<=N;i++){
//         if (i%2==0) {
//             System.err.println("Even");
//         } else{
//             System.err.println("odd");
//         }
//         }
//     }
// }
