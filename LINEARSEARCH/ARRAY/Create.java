// public class Create {
//     public static void main(String[] args){
//         int[] a = new int[10];
//         a[0] = 10;
//         a[1] = 20;
//         a[2] = 30;
//         a[3] = 40;
//         a[4] = 50;
//         a[5] = 60;
//         a[6] = 70;
//         a[7] = 80;
//         a[8] = 90;
//         a[9] = 100;
//         for(int i=0; i<=9; i++){
//         System.out.print(  a[i]+" ," );
//         }
        
//          }
// }


public class Create{
    public static void main(String[] args){
        int[] a ={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<=a.length;i++){          // for(int i= 0; i<=9;i++)  OR for(int i = 0; i<10; i++) 
        System.out.print(a[i] +",");
      }
    }
}