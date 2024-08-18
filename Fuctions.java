// public class Fuctions {
//     public static void HW(){
//         System.out.println("Hello World");
//     }
//     public static void main(String[] args) {
//         HW();
//     }
// }

import java.util.*;
public class Fuctions{
    public static void HW() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    }

    public static int Sum(int A,int B) { //formal parameters 
    
        int sum = A+B;
        return sum;
    }

    public static int Product(int A,int B){
        int prod = A*B;
        return prod;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = Sum(A,B);//actual paramenters or arguments  
        System.out.println("SUM = "+sum);


        int prod = Product(A, B);//(5,10)
        System.out.println("Product = "+prod);

        prod = Product(5,10);
        System.out.println("Product = "+prod);
        
    }
}