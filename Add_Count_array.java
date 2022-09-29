import java.util.ArrayList;
import java.util.Scanner;

public class Add_Count_array {
    static int total1=0, total2=0;
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
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                al1.add(a[i]);
            }
            else{
                al2.add(a[i]);
            }
        }
        System.out.println("The even numbers are: ");
        for(int num:al1){
            System.out.println(num);
            total1=total1+num;
        }
        System.out.println("Number of even numbers are: "+al1.size());
        System.out.println("Sum of even numbers are: "+total1);

        System.out.println("The odd numbers are: ");
        for(int num:al2){
            System.out.println(num);
            total2=total2+num;
        }
        System.out.println("Number of odd numbers are: "+al2.size());
        System.out.println("Sum of odd numbers are: "+total2);
    }
}
