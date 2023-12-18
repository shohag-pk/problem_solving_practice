package LeetCode;

import java.util.*;

public class ContainsDuplicate219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                System.out.println(true);
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int []num = {1,0,1,1};
        containsNearbyDuplicate(num, 1);
    }
}
