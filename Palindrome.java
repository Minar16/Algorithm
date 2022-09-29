import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp; 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");

        // This method reads the number provided using keyboard
        int n = scan.nextInt();
        
        scan.close();   
  
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
    }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
    }
}
