import java.util.Scanner;

public class Strings {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz@#123");

        //Strings are IMMUTABLE 

        //Taking string input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name : "+name);

        //Length of string 
        String Name = "Tony stark";
        int n = Name.length();//length is a function in string
        System.out.println(n);

        //concatenation
        String firstName ="Tusshar";
        String lastName = "Garg";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //Find char at some index in string
        System.out.println(fullName.charAt(2));

        printletters(fullName);
    }
}
