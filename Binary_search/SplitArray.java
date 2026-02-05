package Binary_search;

public class SplitArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(splitArray(arr, 2));

    }
    static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for(int i = 0;i<nums.length;i++){
            start=Math.max(start, nums[i]);
            end+=nums[i];
        }

        while(start<end){

            int mid = start + (end - start)/2;
            int sum = 0;
            int subarr = 1;

            for(int num : nums){

                if(sum+num > mid){
                    sum = num;
                    subarr++;
                }else sum+=num;
            }

            if(subarr<=k) end=mid;
            else start = mid+1;

        }
        return end;
    }
}
