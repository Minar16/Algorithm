import java.util.Scanner;

public class FiboRecursion {
    static int a=0, b=1, c;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        
        scan.close();
        System.out.println(a+"\n"+b);
        FiboRecursion ob = new FiboRecursion();
        ob.printFibo(num-2);
        
    }

    void printFibo(int i){
        if(i>=1){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFibo(i-1);
        }
    }
}
