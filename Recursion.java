//   import java.util.Scanner;

public class Recursion {

    //Print nos. in decreasing order from n to 1
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return; 
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    //Print nos. in increasing order from n to 1
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
       
    }

    //Factorial of n 
    public static int Fact(int n){
        if (n==1) {
            return 1;
        }

        //int fn_1= Fact(n-1);
        int fn=n*Fact(n-1);
        return fn;
    }

    //Sum of n natural nos
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int Sn= n + printSum(n-1);
        return Sn;
    }

    //Fibonacci numbers
    public static int fab(int n){
        if (n==0 || n==1) {
            return n;
        }
       
        int fn=fab(n-1)+fab(n-2);
        return fn;
    }

    //check if Arra sorted or not
    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        }

        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    //First occurence of element in an array
    public static int occurence(int a[],int key,int i){
        if (i==a.length) {
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return occurence(a, key, i+1);
    }

     //Last occurence of element in an array
     public static int Lastoccurence(int a[],int key,int i){
        if (i==0) {
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return Lastoccurence(a, key, i-1);
    }

    //print X^n
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn= x* xnm1;
        return xn;
        //return x*power(x, n-1);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(Sy stem.in);
        // System.out.print("n = ");
        // int n = sc.nextInt();

        int n=10;
        
        printDec(n);

        printInc(n);

        System.out.println();
        System.out.println(Fact(n));

        System.out.println(printSum(n));

        System.out.println(fab(n));

        int arr[]={1,2,3,4,5};
        System.out.println(isSorted(arr, 0));

        int a[]={8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println("i = "+occurence(a, key, 0));
        System.out.println("i = "+Lastoccurence(a, key, a.length-1));
   
        System.out.println(power(2, 5));
    }
}
