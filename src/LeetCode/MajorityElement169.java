package LeetCode;

import java.util.*;
import java.util.stream.Collectors;
//Puskubuapu

public class MajorityElement169 {
    public static int majorityElement(int[] nums) {
        List<Integer> integerList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, Integer> findMajority = new HashMap<>();
        for (Integer number: integerList) {
            if (!findMajority.containsKey(number)){
                findMajority.put(number,0);
            }
            Integer oldCount = findMajority.get(number);
            findMajority.put(number, oldCount+1);
        }
        int maxValueInMap = (Collections.max(findMajority.values()));
        int result = 0;
        for (Map.Entry<Integer, Integer> entry :
                findMajority.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                 result = entry.getKey();
                //System.out.println(entry.getKey());
            }
        }
        //System.out.println(" check"+findMajority);
        System.out.println("result  : "+ result);
        return result;
    }

    public static int majorityElementNew(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int result = nums[length / 2];
        //System.out.println("Best case : "+result);
        return result;
    }

    public static void main(String[] args) {

        int [] nums = {1,3,1,2,1,5,5,5,5,5,5};
        majorityElement(nums);
        majorityElementNew(nums);


    }
}
