package LeetCode.Array_And_String;

import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int pairSum=0;
        int length = nums.length-1;
        for (int i=0;i<length;i++){
            if (i%2==0){
                pairSum+=nums[i];
            }
        }
        System.out.println(pairSum);
        return pairSum;
    }

    public static void main(String[] args) {
        int[] num = {1,4,3,2};
        arrayPairSum(num);
    }
}
