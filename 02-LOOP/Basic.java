// print 1 to n , n is taken by user
import java.util.*;
public class Basic{
    public static void main(String[] args){
     Scanner dog = new Scanner (System.in);
     int number = dog.nextInt();
   
    int count = 1;
    while(count<= number){
        System.out.println(count);
         count = count+1;             // count++;  
    }
}
}