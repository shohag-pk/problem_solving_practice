package LeetCode.Array_And_String;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int j = numbers.length;
        int i=0;
        while (i<j){
            if (numbers[i]+numbers[j-1]==target){
                result[0]=i+1;
                result[1]=j;
                break;
            }

            if (numbers[i]+numbers[j-1]>target){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        int[] num = {2,3,4,7,11,12,13};
        int target = 17;
        twoSum(num,target);
    }
}
