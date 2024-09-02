public class InsertionSort {

    public static void Insertion_Sort(int arr[]){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding the position to insert
            while (prev>=0 && arr[prev]>curr) {////for decending prev>=0 && arr[prev]<curr
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n =arr.length;
        Insertion_Sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
