import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int size = scan.nextInt();

        int[] a=new int[size];
        System.out.println("The array a is: ");
        for(int j=0; j<size; j++){   
            a[j]=scan.nextInt();  
        }  

        System.out.println("Press 0 for maximum or 1 for minimum:");
        int decider = scan.nextInt();

        scan.close();
        

        switch(decider){
            case 0:
                int max=a[0];
                for(int i=0; i<a.length; i++){
                    if (a[i]>max) {
                        max=a[i];
                    }
                }
                System.out.println("The maximum number in the array is: "+max);
                break;
            
            case 1:
                int min=a[0];
                for(int i=0; i<a.length; i++){
                    if (a[i]<min) {
                        min=a[i];
                    }
                }
                System.out.println("The minimum number in the array is: "+min);
                break;
        }
    }    
}
