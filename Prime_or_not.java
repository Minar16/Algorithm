import java.util.Scanner;

class Prime_or_not{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        scan.close();
        int temp = 0;

        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                temp=temp+1;
            }
        }
        
        if(temp>0){
            System.out.println("This is not a Prime Number.");
        }

        else{
            System.out.println("This is a Prime Number.");
        }
    }
}