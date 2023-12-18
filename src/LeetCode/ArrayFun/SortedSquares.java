package LeetCode.ArrayFun;

import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
       /* int[] sortedSqrArray = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            int num = nums[i] * nums[i];
            sortedSqrArray[i] = num;
        }
        Arrays.sort(sortedSqrArray);
        return sortedSqrArray;*/

        int n = nums.length;
        int idx = n - 1;

        int [] result = new int[n];

        int i = 0, j = n - 1;

        while(idx >= 0){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[idx--] = nums[i] * nums[i];
                i++;

            }else{
                result[idx--] = nums[j] * nums[j];
                j--;

            }
        }

        System.out.println(" check :"+Arrays.toString(result));

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
}
