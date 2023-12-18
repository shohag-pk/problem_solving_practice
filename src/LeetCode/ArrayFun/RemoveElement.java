package LeetCode.ArrayFun;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i , idx;
        i = idx = 0;
        while (i<nums.length){
            if (nums[i]!=val){
                nums[idx++]=nums[i];
            }
            i++;
        }
        for(int j = 0; j < idx; j++){
            System.out.println(nums[j]);
        }

        return idx;


    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(nums,val);
    }
}
