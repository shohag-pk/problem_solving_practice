package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> maxPossibleNumber = new HashSet<>();
        for (int i = 1; i <=nums.length ; i++) {
            maxPossibleNumber.add(i);
        }
        for (int i = 0; i <nums.length ; i++) {
            if (maxPossibleNumber.contains(nums[i])){
                maxPossibleNumber.remove(nums[i]);
            }
        }
        List<Integer> result = new ArrayList<>(maxPossibleNumber);
        System.out.println("Result :"+result);
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        findDisappearedNumbers(nums);
    }
}
