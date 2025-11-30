

public class Countsort {
    public static void countsorting(int arr[]){
        int largest = Integer.MIN_VALUE;
        // Step 1: Find largest
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
   
        }   // new array to count only frequency
         int[] count = new int[largest+1]; 

           // Step 2: Count frequency
          for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
          }
 

          // Step 3: Sorting
           int j =0;
          for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
          }

    }
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countsorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
