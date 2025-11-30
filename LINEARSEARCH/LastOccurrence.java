public class LastOccurrence {
    
    public static int lastOccurrence(int[] arr, int key) {
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 10, 30, 10};
        int key = 10;

        int index = lastOccurrence(arr, key);
        System.out.println("Last occurrence index = " + index);
    }
}
