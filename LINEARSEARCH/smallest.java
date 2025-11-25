public class smallest {
    public static int SmallestNum(int num []){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i] < smallest ){
                smallest = num[i];
            }
             
        } 
        return smallest;
    }
    public static void main(String[] args){
       int num [] = {20,3,4,25,34,23,8};
       int smallvalue = SmallestNum(num);
       System.out.print("smallest number is : " +smallvalue);

    }
}
