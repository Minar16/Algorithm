  import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        scan.close();
        int temp = 0;
        for (int j=1; j<=num; j++){
            for(int i=2; i<=j-1; i++){
                if(j%i==0){
                    temp=temp+1;
                }
            }
            if(temp==0){
                System.out.println(j);
            }
            else{
                temp=0;
            }
        }
        
    }
}
