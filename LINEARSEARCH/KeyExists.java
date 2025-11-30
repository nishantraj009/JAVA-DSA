public class KeyExists {

    public static boolean keyexists(int[] arr, int key) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return true;   
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int key = 25;

        boolean result = keyexists(arr, key);
        System.out.println(result);
    }
}
