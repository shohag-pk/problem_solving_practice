package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstMissingPositive41 {
    public static int firstMissingPositive(int[] nums) {
        int firstPossibleNumber = 1;
        Set<Integer> maxPossibleNumber = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] >= 0){
                maxPossibleNumber.add(nums[i]);
            }
            else
            {
                maxPossibleNumber.add(0);
            }
        }
        List<Integer> allPositiveNumber = new ArrayList<>(maxPossibleNumber);
        System.out.println(allPositiveNumber);

        if (allPositiveNumber.get(0) == 0 && allPositiveNumber.size() == 1){
            System.out.println(firstPossibleNumber);
            return firstPossibleNumber;
        }

        if (allPositiveNumber.get(0) == 1 && allPositiveNumber.size() == 1){
            System.out.println(firstPossibleNumber);
            return firstPossibleNumber+1;
        }

        if (allPositiveNumber.get(0) > 1 ){
            System.out.println(firstPossibleNumber);
            return firstPossibleNumber;
        }

        for (int i = 0; i <allPositiveNumber.size() - 1; i++) {
            if (allPositiveNumber.get(i+1) - allPositiveNumber.get(i) > 1){
                firstPossibleNumber = allPositiveNumber.get(i) + 1;
                System.out.println(firstPossibleNumber);
                break;
            }

            else
            {
                firstPossibleNumber = allPositiveNumber.get(allPositiveNumber.size() - 1) + 1;
            }
        }

        System.out.println(firstPossibleNumber);

        return firstPossibleNumber;


    }

    public static void main(String[] args) {
        int nums[] = {0,1};
        firstMissingPositive(nums);

    }
}
