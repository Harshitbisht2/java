package Binary_search;

public class RotatedRepeatArray {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 0;
        int pivotv = pivot(arr);
        int searchL = binarySearchLeft(arr, target, pivotv);
        int searchR = binarySearchRight(arr, target, pivotv+1);
        if(searchL!=-1 || searchR!= -1) System.out.println("true");
        else  System.out.println("false");
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start<end){
            int mid = start + (end - start)/2;

            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid-1]>arr[mid]) return mid-1;

            if(arr[mid]==arr[start] && arr[mid]==arr[end] ){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start = mid;
            }else{
                end = mid-1;
            }
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
