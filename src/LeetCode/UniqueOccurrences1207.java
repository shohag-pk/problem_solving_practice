package LeetCode;

import java.util.*;

public class UniqueOccurrences1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: arr){
            if (!map.containsKey(num)){
                map.put(num, 0);
            }
            Integer old = map.get(num);
            map.put(num, old+1);
        }
        System.out.println(map);
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if (!set.add(e.getValue())){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
    public static void main(String[] args) {
        int num[] = {1,2};
        uniqueOccurrences(num);
    }
}
