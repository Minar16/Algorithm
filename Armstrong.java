import java.util.Scanner;

public class Armstrong{
    static int arm=0, r;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = scan.nextInt();

        scan.close();

        int length=0;
        int t1=num;
        while(t1!=0){
            length=length+1;
            t1=t1/10;   
        }
    
        int t2=num;
        while(t2!=0){
            int mul=1;
            r=t2%10;
            for(int i=1; i<=length; i++){
                mul=mul*r;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==num){
            System.out.println(num+" is an Armstrong Number.");
        }
        else{
            System.out.println(num+" isn't an Armstrong Number.");
        }
    }       
}
