package LeetCode.ArrayFun;

import java.util.Arrays;

public class FindMaxConsecutiveNumber {
    public  static int findMaxConsecutiveOnes(int[] nums) {
        int con = 0;
        int max = 0;

        for(int i=0; i<nums.length ; i++){
            con++;
            if(nums[i]== 0){
                con=0;
            }
            if (max<con){
                max= con;
            }
        }
        System.out.println("Check :"+max);
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {1};
        findMaxConsecutiveOnes(nums);
    }
}
