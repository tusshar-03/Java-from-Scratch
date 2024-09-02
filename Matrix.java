import java.util.*;
public class Matrix {

    public static boolean search(int matrix[][], int key){

        int n=3,m=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(key==matrix[i][j]){
                    return true;
                }
            }
        }return false;
    }

    public static void main(String[] args) {

        int matrix[][]= new int[3][3];
        int n=3,m=3;

        int key=5;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println(search(matrix, key));
    }
}
