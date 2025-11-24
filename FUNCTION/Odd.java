
import java.util.*;
public class Odd{
    public static void isEven(int ans){
        if(ans%2==0){
          System.out.print("even");
        }else{
            System.out.print("odd");
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int ans = sc.nextInt();
          isEven(ans);
      
    }
}
