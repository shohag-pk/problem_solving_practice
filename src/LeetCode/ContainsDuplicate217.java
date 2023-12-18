package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        Set<Integer> dupTest = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if (!dupTest.add(nums[i])){
                count++;
                break;
            }
        }

        if (count > 0){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args) {
        int []num = {1,2,3,4};
        containsDuplicate(num);
    }
}
