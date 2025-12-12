// print the number is prime or not

import java.util.*;
public class Prime {
    public static void main(String[] args){
       Scanner day = new Scanner(System.in);
        int num = day.nextInt();
        int count = 0;
        if(num <= 1){
            System.out.println("not");
            return; 
        }
         for(int i=1;i<=num;i++){
             if(num%i==0){
               count = count+1;
        }
    }
         if(count==2)
          System.out.println("prime");
      else
        System.out.println("not");  
    }
    }

