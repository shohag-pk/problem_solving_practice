package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber137 {

    public static int singleNumber(int[] nums) {
        int result=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            if (!map.containsKey(num)){
                map.put(num, 0);
            }
            Integer old = map.get(num);
            map.put(num, old+1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if (e.getValue()==1){
                result=e.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,1,0,1,99};
        singleNumber(nums);
        System.out.println(singleNumber(nums));
    }
}
