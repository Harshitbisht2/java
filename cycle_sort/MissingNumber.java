package cycle_sort;

class MissingNumber {
    public int missingNumber(int[] nums) {
        int i=0;
        int temp;
        while(i<nums.length){
            if(nums[i]==nums.length){
                i++;
                continue;
            } 
            else if(nums[i]!=i){
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
            else i++;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }

    // public void swap(int[] arr,int a,int b){
    //     int temp=arr[a];
    //     arr[a]=arr[b];
    //     arr[b]=temp;
    // }
}
