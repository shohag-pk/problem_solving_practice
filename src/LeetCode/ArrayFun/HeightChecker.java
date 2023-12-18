package LeetCode.ArrayFun;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int count=0;
        int l = heights.length;
        int[] expectedNumber;
        expectedNumber = heights.clone();
        Arrays.sort(expectedNumber);
        for (int i=0; i<l; i++){
            if (heights[i]!=expectedNumber[i]){
                count++;
            }
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        heightChecker(nums);
    }
}
