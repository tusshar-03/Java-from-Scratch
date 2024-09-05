public class DiagonalSum {

    public static int Diagonal_Sum(int matrix[][]){
    //     int PD=0;
    //     int SD=0;
        
    //     int n = matrix.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i==j){
    //                 PD=PD+matrix[i][j];
    //             }
    //             if(i+j==n-1){
    //                 SD=SD+matrix[i][j];
    //             }
    //         }
            
    //     }
    //     System.out.println("PD = "+PD);
    //     System.out.println("SD = "+SD);
    //     int sum=PD+SD;
    //    return sum;

    int sum=0;
    for(int i=0;i<matrix.length;i++){
        //PD
        sum=sum+matrix[i][i];

        //SD
        if(i!=matrix.length-i-1)
        sum+=matrix[i][matrix.length-i-1];
    }
    return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println(Diagonal_Sum(matrix));
    }
}
