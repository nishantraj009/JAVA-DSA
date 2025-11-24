
import java.util.*;
public class Inputuser { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");

        int inp = sc.nextInt();
        int[] arr = new int[inp];

        System.out.print("Enter the array's Elements:\n");

        for(int i=0;i<inp;i++){
            arr[i] = sc.nextInt();
     }
     for(int i =0;i<inp;i++){
        if(arr[i]%2==0){
       System.out.print(arr[i]*2 +",");
        }
        
     }

    }
}
