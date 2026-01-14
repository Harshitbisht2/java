package Binary_search;

public class OrderAgnosticBS {
    
    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 18;

        int result =  binarySearch(arr, target);

        if(result != -1){
        System.out.printf("%d found in index %d", target, result);
        }else{
        System.out.printf("%d not found", target);
        }
    }

    

    static int binarySearch(int[] arr, int target){
        if(arr[0]>arr[arr.length-1]){
            return descendingBS(arr, target);
        }else{
            return asscendingBS(arr, target);
        }
    }

    static int asscendingBS(int[] arr, int target){
        int start = 0; 
        int end = arr.length-1;

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

    static int descendingBS(int[] arr, int target){
        int start = 0;
        int  end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                start = mid + 1;
            }
            else if(target > arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}


