import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int size = scan.nextInt();

        int[] a=new int[size];
        System.out.println("The array a is: ");
        for(int i=0; i<size; i++){   
            a[i]=scan.nextInt();  
        }  
        scan.close();

        int[] temp=new int[a.length];
        int j=0;
        System.out.println("Not repeated elements in the array are: "); 
        for(int i=0; i<a.length-1; i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            } 
        }
        temp[j]=a[a.length-1];

        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
        }  
    }
}
