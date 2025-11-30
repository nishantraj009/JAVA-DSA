public class findkey {

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid =  (start+end) / 2; 

            if(arr[mid] == key) {
                return mid; // key mil gaya
            }

            if(arr[mid] < key) {
                start = mid + 1; // right side me jao
            } else {
                end = mid - 1; // left side me jao
            }
        }

        return -1; // key nahi mila
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = binarySearch(arr, key);

        
            System.out.println("Element found at index: " + result);
        }
    }

