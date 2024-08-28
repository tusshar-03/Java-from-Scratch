public class SubArray {

    public static void Sub_Array(int Arr[]){
        int n = Arr.length;
        int TS=0;

        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end=j;
                for(int k=start;k<=end;k++){   //(int k=i;k<=j;k++)
                    System.out.print(Arr[k]+" ");
                
                }
                TS++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : "+TS);
    }

    public static void main(String[] args) {
        int Arr[]={2,4,6,8,10};

        Sub_Array(Arr);
    }
}
