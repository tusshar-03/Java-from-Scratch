public class PrimeNo {

    // public static boolean isPrime(int n){
    //     boolean isPrime= true ;
    //     for (int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime=false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }

    // public static boolean isPrime(int n){ 
    //     for (int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
//Prime Nos in range 
    public static void PrimeInRange(int n){
        
        for(int i=2;i<=n;i++){
            if(isPrime(i)){ //ttue
            System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(14 ));//value of n passed
        PrimeInRange(20);
        
    }
}
