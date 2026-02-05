package Binary_search;

public class RotatedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,6,7,8,9};
        int target = 9;
        int pivotv = pivot(arr);
        int searchL = binarySearchLeft(arr, target, pivotv);
        if(searchL!=-1){
            System.out.println(searchL);
        }else System.out.println(binarySearchRight(arr, target, pivotv+1));

        // if (target == arr[pivotv]) System.out.println(pivotv);
        // else if(target < arr[0]) System.out.println(binarySearchRight(arr, target, pivotv+1));
        // else System.out.println(binarySearchLeft(arr, target, pivotv-1));
        

    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]) return mid;
            if(mid > start && arr[mid] < arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[start]) end = mid-1;
            else  start = mid;
            ans = mid;
        }
        return ans;
    }
    static int binarySearchLeft(int[] arr, int target, int end){
        int start = 0;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]<target) start = mid+1;
            else if(arr[mid]>target) end = mid-1;
            else return mid;
        }
        
        return -1;
    }
    static int binarySearchRight(int[] arr, int target, int start){
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]<target) start = mid+1;
            else if(arr[mid]>target) end = mid-1;
            else return mid;
        }
        
        return -1;
    }
    
}
