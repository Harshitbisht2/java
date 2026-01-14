package Binary_search;

/* Basic Idea of Binary search
    - it is applied on sorted array.
    - needs four variable start, end, middle and target.
    - start: first element of the array, end last element of the array, middle: middle element of the array, target: element to find.
    - logic: if(middle>target){end=middle} else{start=middle} repeat this until the element is found.
    - time complexity: Best case: O(1), worst case: O(log₂N) 
    - algo: 
    while(arr[end]-arr[start]!=0){
        middle=start+(end-start)/2
        if(arr[middle]>target){
            end = middle;
        }elseif(arr[middle]<target){
            start = middle;
        }elseif(arr[middle]==target){
            return middle;
        }else{
            return -1;
        }
    }
     */
public class BinaryBasic {
    public static void main(String[] args) {

        int[] arr = {-12, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = -1;

        int result = binarySearch(arr, target);

        if(result!=-1){
            System.out.printf("%d found on index %d", target, result);
        }else{
            System.out.printf("%d not found in the array", target);
        }
        
    }
    static int binarySearch(int[] arr, int target){
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
}
