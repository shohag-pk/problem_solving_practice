package LeetCode;


import java.util.*;

public class ThirdMax414 {
    public static int thirdMax(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            numSet.add(nums[i]);
        }
        List<Integer> numList = new ArrayList<>(numSet);
        Collections.sort(numList, Collections.reverseOrder());
        if (numList.size()>2){
            return numList.get(2);
        }
        else {
            return numList.get(0);
        }
    }

    public static void main(String[] args) {
        int num[] = {2,2,3,1};
        thirdMax(num);
    }
}
