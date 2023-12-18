package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfUnique {
    public static int sumOfUnique(int[] nums) {
        int count = 0;
        Set<Integer> check = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            check.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j])
                   result.add(nums[i]);
            }
        }
        for (Integer num: result) {
            check.remove(num);
        }
        if (check.size()>0){
            for(Integer e: check){
                count += e;
            }
            System.out.println(count);
            return count;
        }

        else {
            System.out.println(0);
            return 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,1,2,3,2};
        sumOfUnique(nums);
    }
}
