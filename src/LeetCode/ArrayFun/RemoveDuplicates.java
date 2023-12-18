package LeetCode.ArrayFun;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i , idx;
        i = idx = 0;
        int l= nums.length-1;
        while (i<l){
            if (nums[i]!=nums[i+1]){
                nums[idx++]=nums[i];
            }
                i++;
        }
        nums[idx++] = nums[l];
        for (int j=0; j<idx; j++){
            System.out.println(nums[j]);
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}
