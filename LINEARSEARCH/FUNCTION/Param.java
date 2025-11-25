// public class Param {
//     public static int  Fun(int a,int b){
//       int sum = a+b;
//       return sum;
//     }
//     public static void main(String[] args){
//        int all = Fun(20,30);
//         System.out.print(all);
//     }
// }


import java.util.*;
public class Param{
    public static void Aim(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("sum is : " +sum);
    }
 public static void main(String[] args) {
     Aim();
 }
}
