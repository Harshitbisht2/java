package Binary_search;

    class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int rotation = pivot(nums)+1;
        if(rotation>nums.length) System.out.println(nums[0]);
        else System.out.println(nums[rotation]);
    }
    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int ans = 0;

        while(start<end){

            int mid = start + (end - start)/2;
            
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;

            if(nums[mid]==nums[start] && nums[mid]==nums[end]){

                if(nums[start]>nums[start+1]) return start;
                start++;
                if(nums[end]<nums[end-1]) return end-1;
                end--;
            }else if(nums[start]<nums[mid] || (nums[mid]==nums[start] && nums[mid]<nums[end])) start = mid;
            else end = mid-1;

            ans = mid;
        }
        return ans;
    }
}

