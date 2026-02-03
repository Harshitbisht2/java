package Binary_search;


// Find the position of an element in a sorted array of infinite numbers.


public class infiniteArray {

    public static void main(String[] args){
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int result = binarySearch(arr, target, window(arr, target)[0], window(arr, target)[1]);
        System.out.printf("index = %d", result);
    }

    static int[] window(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newstart = end + 1;
            // end + size * 2
            end = end + (end - start +1) * 2;
            start = newstart;
        }
        return new int[] {start, end}; 
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            //int mid = (start+end)/2; //might be possible that (start+end) exeeds the range of int in java.
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
