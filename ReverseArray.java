public class ReverseArray {

    public static void Reverse(int arr[]){
        int n= arr.length-1;
        int i=0;
        for( i=0;i<n/2;i++)//while (i<n)
        {
            int temp=arr[n-i];//n
            arr[n-i]=arr[i];
            arr[i]=temp;
            // i++;
            // n--;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
 
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
