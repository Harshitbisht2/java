package Binary_search;

public class insertInArray {

    public static void main(String[] args){
        int[] arr = {1, 2, 5, 6};
        int target = 7;
        int res = searchInsert(arr, target);
        System.out.println(res);
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(nums[mid]<target) start = mid+1;
            else if(nums[mid]>target) end = mid-1;
            else return mid;
        }

        return start;
    }
}

