package LeetCode;

import java.util.*;

public class FindDuplicates442 {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> checkSet = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!checkSet.add(nums[i])){
                result.add(nums[i]);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
    }
}
