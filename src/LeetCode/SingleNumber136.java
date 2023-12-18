package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber136 {
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
        System.out.println(map);
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if (e.getValue()==1){
                System.out.println(e.getKey());
               result=e.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num[] = {4,1,1,2,2};
        singleNumber(num);
    }
}
