import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){

        Scanner scan= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String name= scan.nextLine();              //reads string   
       

        scan.close();

        int len = name.length();
        String rev = "";

        for(int i = len-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        System.out.println("Reverse of the Name is: "+rev);

    }
}
