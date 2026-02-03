package Binary_search;

// find a number in the array that is smallest of the numbers that are greater than the target. 

public class FloorNo {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 8;
        System.out.println("function called");
        int result = check(arr, target);
        System.out.println("safe");
        if(result != -1){
            System.out.printf("%d is the floor of %d", arr[result], target);
        }else{
            System.out.printf("There is no floor of %d", target);
        }
    }

    static int check(int[] arr, int target){
        if(arr[1]<arr[arr.length-1]){
            return ceilingBS(arr, target);
        }else{
            return rCeilingsBS(arr, target);
        }
    }
    
    static int ceilingBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }

    static int rCeilingsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                start = mid + 1;
            }
            else if(arr[mid]<target){
                end = mid - 1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }

}
