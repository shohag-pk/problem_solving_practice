package LeetCode;

import java.util.Arrays;
import java.util.Collections;

public class MaxProduct1464 {
    public static int maxProduct(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        int result = (nums[l - 1] - 1) * (nums[l - 2] - 1);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int num[] = {3,7};
        maxProduct(num);
    }
}
