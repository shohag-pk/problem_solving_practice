package LeetCode;

import java.util.Arrays;

public class Array1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]) {
                    count = count + 1;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        int num[] = {8,1,2,2,3};
        smallerNumbersThanCurrent(num);
    }
}
