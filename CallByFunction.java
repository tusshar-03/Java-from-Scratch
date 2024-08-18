public class CallByFunction {
    public static void Swap(int a, int b){
        //swap
        int temp=a;
        a=b; 
        b=temp;
        
    }
    public static void main(String[] args) {
        //Swap- excahnge values 
        int a = 5;
        int b = 10;
        
        Swap(a, b);
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
