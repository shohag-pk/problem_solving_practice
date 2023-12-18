package LeetCode.Array_And_String;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int l = nums.length;
        int[] temp = new int[l];

        for (int i = 0; i < l; i++) {
            temp[(i + k) % l] = nums[i];
        }

        for (int i = 0; i < l; i++) {
            nums[i] = temp[i];
        }

        System.out.println("result: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(num,k);
    }
}
