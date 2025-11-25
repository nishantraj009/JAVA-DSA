

public class reverse {
    public static void reverseRun(int run[]){
    int start = 0, end = run.length-1;
      while(start < end){
        int temp = run[end];
         run[end] = run[start];
         run[start] = temp;
         start++;
         end--;
      }
    }
    public static void main(String[] args) {
        int[] run = {45,30,60,20,40,65,75,85};
        reverseRun(run);
        for(int i=0; i<run.length; i++){
          System.out.print(run[i]+" ");
        }
      
    }
}
