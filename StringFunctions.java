public class StringFunctions {

    // public static String SubString(String str,int si, int ei ){
    //     String substr="";
    //     for(int i=si;i<ei;i++){
    //         substr+= str.charAt(i);
    //     }
    //     return substr;
    // }

    public static void main(String[] args) {
        //COMPARE
        String S1="Tony";
        String S2= new String("Tony");

        if(S1==S2){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

        //Correct function to compare
        if(S1.equals(S2)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }


        //Sub string
        String str="HelloWorld";
        
        System.out.println(str.substring(0,5));
        
        
        //System.out.println(SubString(str, 3, 7));//si and ei passed here
    }
}
