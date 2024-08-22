public class AdvancedPatterns {

    public static void Hollow_rect(int Rows,int Cols){
        
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=Cols;j++){
                if(i==1||i==Rows||j==1||j==Cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n){
        for(int i =1; i<=n;i++){
            //spaces
            for(int j=1;j<= n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void halfPyramidNum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }

    public static void FloydsTriangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(count);
                    count++;
                }
                System.out.println();
            }
    }

    public static void BinaryTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                    
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n){
        for(int i =1; i<=n;i++){
            //stars
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Rhombus(int n){
        for(int i =1; i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<= n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                
            System.out.println();
        }
    }

    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Hollow_rect(4,5);
        
        halfPyramid(4);

        halfPyramidNum(5);

        FloydsTriangle(5);

        BinaryTriangle(5);

        Butterfly(4);

        Rhombus(5);

        Hollow_Rhombus(5);

        Diamond(4);
    }
}

