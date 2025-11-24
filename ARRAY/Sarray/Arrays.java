public class Arrays {
    public static int getLargest(int num[]){
     int largest = Integer.MIN_VALUE;
     for(int i=0;i<num.length;i++){
        if(num[i]>largest){
            largest=num[i];
        }

     }
        return largest;
    }
        
    public static void main(String[] args) {
        int[] num = {10,15,20,25,30};
       int nish = getLargest(num);
        System.out.println("largest" +nish);
    }
    
}
