import java.util.*;
public class Arraysumm {
   public static void main(String[] args) {
    System.out.print("Enter the array size: ");
     Scanner sc = new Scanner(System.in);
     int X = sc.nextInt();
     int[] arr = new int[X];
     System.out.print("Enter the array Elements:\n ");
     int sum = 0;
     for(int i =0;i<X;i++){
        arr[i] = sc.nextInt();
        
         sum =sum+ arr[i];
     }
     System.out.println("Sum of Array : "+sum);
   }
} 


