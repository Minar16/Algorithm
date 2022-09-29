import java.util.Scanner;

public class NotDuplicate {
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

        int yes=a[0];
        for(int i=1; i<a.length; i++){
            yes=yes^a[i];
        }
        System.out.println("Not repeated element in the array is: "+yes);   
    }
}
