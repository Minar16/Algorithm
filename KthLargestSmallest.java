import java.util.Scanner;

public class KthLargestSmallest{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int size = scan.nextInt();

        int[] a=new int[size];
        System.out.println("The array a is: ");
        for(int m=0; m<size; m++){   
            a[m]=scan.nextInt();  
        }  
        System.out.println("Which largest or smallest element of the array: ");
        int k = scan.nextInt();
        System.out.println("Press 0 for "+k+ " largest or 1 for " +k+ " smallest:");
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
                    if (i==k-1) {
                        System.out.println("The "+k+" th largest number in the array is: "+a[i]);
                        break;
                    }  
                }
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
                    if (i==k-1) {
                        System.out.println("The "+k+ " th smallest number in the array is: "+a[i]);
                        break;
                    }
                }
                break;
        }
    }    
}
