public class PalindroneString {

    // public static boolean Palindrone(String str){
    //     int n=str.length();
    //     int start=0;
    //     int end = n-1;
    //     int mid = (start+end)/2;
    //     for(int i=0;i<=mid;i++){
    //         if(str.charAt(i)!=str.charAt(end-i)){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    public static boolean Palindrone(String str){
        int n=str.length()-1;
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "maddam";

        System.out.println(Palindrone(str));
    }
}
