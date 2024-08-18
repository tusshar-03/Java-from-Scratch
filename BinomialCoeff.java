import java.util.Scanner;

public class BinomialCoeff {

    public static int Factorials(int n){
        int f = 1;

        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    
    public static int BinCoeff(int n, int r){
        int fact_n = Factorials(n);
        int fact_r = Factorials(r);
        int fact_nmr = Factorials(n-r);

        int BinCoeff = fact_n/(fact_r*fact_nmr);

        return BinCoeff;//return fact_n/(fact_r*fact_nmr);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(BinCoeff(n,r));
    }
}
 