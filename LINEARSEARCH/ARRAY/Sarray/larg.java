
public class larg {
    public static void main(String[] args) {
       int[] num = {10,20,30,40,50,60};
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
           if(num[i]>largest){
            largest = num[i];


           }
        }
        System.out.println("largest:"+largest);



    }
}
