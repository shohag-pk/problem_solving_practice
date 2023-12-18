package LeetCode.ArrayFun;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int idx=0, odd=0, set = 0;
        int l = nums.length;
        int[] oddNum = new int[l];
        for (int i=0; i<l; i++){
            if (nums[i] %2 == 0){
                nums[idx]=nums[i];
                idx++;
            }
            else {
                oddNum[odd]=nums[i];
                odd++;
            }
        }
        for (int j=idx; j<l;j++){
            nums[j]=oddNum[set];
            set++;
        }
        System.out.println("Result :"+ Arrays.toString(nums));
        return nums;

    }

    public static void main(String[] args) {
        int num[] = {3,1,2,4};
        sortArrayByParity(num);
    }
}
