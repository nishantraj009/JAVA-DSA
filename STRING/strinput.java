
// String is Immutable

import java.util.*;
public class strinput {
    public static void main(String[] args) {
        char [] arr ={'a','b','c'};
        String str1 = "abcd";
        String str2 = new String("xyz");

        //input string

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter any string :");
        name = sc.next();
        System.out.println("string is : " +name);
         
        // string length

        System.out.print("length is : "+name.length());

        // Concatenation

        // String firstname = "Nishant";
        // String lastname  = "Raj";
        // String fullname = firstname+" "+lastname;
        // System.out.print("Full name is :" +fullname);
    }
}
