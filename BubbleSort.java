public class BubbleSort {

    public static void Bubble_Sort(int arr[]){
        int n =arr.length;
        int swap=0;
        for(int turn=0;turn<n-1;turn++){
            
            for(int j=0;j<(n-1-turn);j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            
        }
        System.out.println("Total swaps : "+swap);
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n =arr.length;
        Bubble_Sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
