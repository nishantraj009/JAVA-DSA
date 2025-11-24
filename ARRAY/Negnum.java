
import java.util.*;
public class Negnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
         System.out.print("Enter the array Elements:\n ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
          System.out.print("Negative numbers: ");
         for(int i=0;i<n;i++){
             if(arr[i] < 0){
             System.out.print(arr[i]+",");
        }
        }
        }
    }


