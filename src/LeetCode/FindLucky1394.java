package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindLucky1394 {
    public static int findLucky(int[] arr) {
        int result= -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num :arr){
            if (!map.containsKey(num)){
                map.put(num,0);
            }
            Integer value = map.get(num);
            map.put(num,value+1);
        }
        for (Map.Entry<Integer,Integer> keyValue : map.entrySet()){
            if(keyValue.getKey() == keyValue.getValue()){
                if (keyValue.getKey()>result) {
                    result = keyValue.getKey();
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num = {2,2,2,3,3,3};
        findLucky(num);
    }
}
