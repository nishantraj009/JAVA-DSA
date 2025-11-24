public class largest{
    public static int LargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity number
        for(int i=0;i<numbers.length; i++){
          if(numbers[i] > largest){
            largest = numbers[i];
          }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers [] = {8,10,12,15,30,45,60,80};
        int larger = LargestNum(numbers);
        System.out.print("largest number is : " +larger);
    }
}