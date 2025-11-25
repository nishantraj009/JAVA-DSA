

import java.util.*;
public class Arraymul {
    public static void main(String[] args) {
        System.out.print("Enter the array size : ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int[] arr = new int[mul];
        int result = 1;
        System.out.println("Enter the array Elements : ");

        for(int i=0;i<mul;i++){
            arr[i] = sc.nextInt();
            result = result * arr[i];
        }
          
          System.out.print("Multiple of array : "+ result);
    }
}

