package LeetCode.ArrayFun;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        int l = nums.length;

        for (int i=0; i<l; i++){
            if (nums[i] != 0){
                nums[idx]=nums[i];
                idx++;
            }
        }

        for (int j=idx; j<l;j++){
            nums[j]=0;
        }

        System.out.println(idx);
        System.out.println("Result :"+ Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int num[] = {0,1,0,0,2};
        moveZeroes(num);
    }

}
