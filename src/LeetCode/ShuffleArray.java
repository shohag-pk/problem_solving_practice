package LeetCode;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {

        int  low = 0;
        int mid = n;
        int len = nums.length;
        int result[] = new int[len];
        for (int i=0; i<2 * n; i=i+2){
            result[i]=nums[low++];
            result[i+1] = nums[mid++];
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int num[] = {1,1,2,2};
        int n =num.length / 2;
        shuffle(num,n);
    }
}
