package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {

        int result[] = new int[nums.length];
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            number.add(index[i],nums[i]);
        }
        for (int i = 0; i < number.size() ; i++) {
            result[i] = number.get(i) ;
        }

        return result;
    }
    public static void main(String[] args) {
       int nums[] = {0, 1, 2, 3, 4};
       int index[] = {0,1,2,2,1};

       createTargetArray(nums,index);
    }
}
