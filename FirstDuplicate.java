import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int size = scan.nextInt();

        int[] a=new int[size];
        System.out.println("The array a is: ");
        for(int j=0; j<size; j++){   
            a[j]=scan.nextInt();  
        }  

        scan.close();
        for(int i=0; i<a.length-1; i++){
            int temp=0;
            for(int j=i+1; j<a.length; j++){
                if (a[i]==a[j] && i!=j) {
                    temp=temp+1;
                    System.out.println("1st Duplicate element of the array: "+a[j]);
                    break;
                }
            }
            if (temp>0) {
                break;
            }  
        }   
    }
}
