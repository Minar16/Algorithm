import java.util.Scanner;

public class SecondLargeSmall{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int size = scan.nextInt();

        int[] a=new int[size];
        System.out.println("The array a is: ");
        for(int m=0; m<size; m++){   
            a[m]=scan.nextInt();  
        }  

        System.out.println("Press 0 for second largest or 1 for second smallest:");
        int decider = scan.nextInt();

        scan.close();
        

        switch(decider){
            case 0:
                int t1;
                for(int i=0; i<a.length; i++){
                    for(int j=i+1; j<a.length; j++){
                        if (a[i]<a[j]) {
                            t1=a[i];
                            a[i]=a[j];
                            a[j]=t1; 
                        }
                    }  
                }
                System.out.println("The second largest number in the array is: "+a[1]);
                break;
            
            case 1:
                int t2;
                for(int i=0; i<a.length; i++){
                    for(int j=i+1; j<a.length; j++){
                        if (a[i]>a[j]) {
                            t2=a[i];
                            a[i]=a[j];
                            a[j]=t2;
                        }
                    }
                }
                System.out.println("The second smallest number in the array is: "+a[1]);
                break;
        }
    }    
}
