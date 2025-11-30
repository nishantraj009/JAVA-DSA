public class keycount {
    public static void KeyCount(int numbers[], int key){
        int count = 0;
        for(int i = 0;i<numbers.length; i++){
            if(numbers[i] == key){
                count++;
            }
        }
        System.out.print("key count is :" +count);
    }
    public static void main(String[] args){
        int numbers[] = {2,1,3,6,1,8,1,9};
        int key = 1;
         KeyCount(numbers, key);
       
    }
}
