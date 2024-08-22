public class Arrays {

    public static void update(int marks[],int noncahngeable){
        noncahngeable=20;
        for(int i=0;i<marks.length;i++){ 
            marks[i]=marks[i]+1;
           // System.out.print(marks[i]+" ");
        }
        //System.out.println();
    }

    public static void main(String[] args) {
        //ARRAY CREATION
        // int marks[]= new int[50];
        // int num[]={1,2,3};        

        int marks[]={97,98,99};
        
        int noncahngeable=5;
        update(marks,noncahngeable);

        System.err.println(noncahngeable);
        //print marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public static void fill(int[] ways, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }
}
