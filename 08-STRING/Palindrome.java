
import java.util.*;
public class Palindrome {
    public static String strPalindrome(String name) {
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i) == name.charAt(name.length()-i-1)){
                  return "palindrome";
            }
           
        }
        return " not a palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name= sc.next();
       String nish = strPalindrome(name);
       System.out.print(nish);
    }
}

