package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctIntegers2442 {
    public static int countDistinctIntegers(int[] nums) {
        int l = nums.length;
        int result[] = new int[2*l];
        for (int i=0;i<l;i++){
            StringBuilder s = new StringBuilder(String.valueOf(nums[i]));
           result[i]= Integer.parseInt(String.valueOf(s.reverse()));
        }
        for (int element : nums){
            result[l]=element;
            l++;
        }
        System.out.println(Arrays.toString(result));
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: result){
            if (!map.containsKey(num)){
                map.put(num, 0);
            }
            Integer old = map.get(num);
            map.put(num, old+1);
        }
        System.out.println(map);
        int count = (int) map.keySet().stream().count();
        System.out.println(count);
        return count;


    }

    public static void main(String[] args) {
        int num[] = {4,13,31,12,1};
        countDistinctIntegers(num);
    }
}
