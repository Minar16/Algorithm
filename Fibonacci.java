import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        
        scan.close();
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        int c;

        for(int i=1; i<=num-2; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
