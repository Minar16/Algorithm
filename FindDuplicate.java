import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
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
        
        HashMap<Integer, Integer> s=new HashMap<>();
        for(int num:a){
            Integer count=s.get(num);
            if (count==null){
                s.put(num, 1);
            }
            else{
                count=count+1;
                s.put(num, count);
            }
        }

        System.out.println("The duplicate numbers are: ");
        Set<Map.Entry<Integer, Integer>> es = s.entrySet();
        for(Map.Entry<Integer, Integer> me : es){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}
