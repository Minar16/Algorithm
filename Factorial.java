import java.util.Scanner;

class factorial{
    static int fact = 1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        scan.close();

        factorial ob = new factorial();
        ob.calFact(num);
        System.out.println("Factorial of the number "+num+" is "+fact);
    }

    void calFact(int num){
        if (num>=1){
            fact = fact*num;
            calFact(num-1);
        }
    }
}