package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate287 {
    public static int findDuplicate(int[] nums) {
        /*int result =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num :nums){
            if (!map.containsKey(num)){
                map.put(num,0);
            }
            Integer value = map.get(num);
            map.put(num,value+1);
        }
        for (Map.Entry<Integer,Integer> keyValue : map.entrySet()){
            if(keyValue.getValue()>1){
                result = keyValue.getKey();
            }
        }
        System.out.println(result);
        return result;*/

        int l = nums.length-1;
        int n = (l * (l + 1)) / 2;
        int sum=0;

        for(int num:nums){
            sum=sum+num;
        }
        System.out.println(sum-n);
        return sum - n;
    }

    public static void main(String[] args) {
        int num[] = {3,1,3,4,2};
        findDuplicate(num);
    }
}
