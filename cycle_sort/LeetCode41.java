package cycle_sort;

import java.util.Arrays;

public class LeetCode41 {
    // public static void main(String[] args) {
    //     int[] nums={3,4,-1,1};
    //     firstMissingPositive(nums);
    //     System.out.println(Arrays.toString(nums));
    // }
    // static int firstMissingPositive(int[] nums) {
    //     int i=0;
    //     int missing=0;
    //     while(i<nums.length){
    //         if(nums[i]<nums.length && nums[i]>0){
    //             int correct=nums[i]-1;
    //             if(nums[i]!=nums[correct]){
    //                 int temp=nums[i];
    //                 nums[i]=nums[correct];
    //                 nums[correct]=temp;
    //             }else i++;
    //         } else i++;
    //     }
    //     for(int j=0; j<nums.length; j++){
    //         if(j+1!=nums[j]) missing=j+1;
    //     }
    //     return missing;
    // }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        int length=s.length();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                length=s.length()-i-1;
            }
        }
        return length;
    }
}
