public class SelectionSort {

    public static void Selection_Sort(int arr[]){
         int n =arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j =i+1;j<n;j++){
                if(arr[minPos]>arr[j]){//for decending arr[minPos]<arr[j]
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
                arr[minPos]=arr[i];
                arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n =arr.length;
        Selection_Sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
