package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDifference2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> difSet1 = new ArrayList<>();
        List<Integer> difSet2 = new ArrayList<>();

        Map<Integer,Integer> num1Map= new HashMap<>();
        Map<Integer,Integer> num2Map= new HashMap<>();

        for (int i=0; i<nums1.length; i++){
            num1Map.put(nums1[i], i);
        }

        for (int i=0; i<nums2.length; i++){
            num2Map.put(nums2[i], i);
        }

        for (int i=0; i<nums1.length; i++){
            if (!num2Map.containsKey(nums1[i])){
                if (!difSet1.contains(nums1[i])) {
                    difSet1.add(nums1[i]);
                }
            }
        }

        for (int i=0; i<nums2.length; i++){
            if (!num1Map.containsKey(nums2[i])){
                if (!difSet2.contains(nums2[i])) {
                    difSet2.add(nums2[i]);
                }
            }
        }

        result.add(difSet1);
        result.add(difSet2);
        System.out.println("check result : "+result);

        return result;
    }

    public static void main(String[] args) {

        int[] num1 ={-68,-80,-19,-94,82,21,-43};
        int[] num2 ={-63};

        findDifference(num1,num2);

    }
}
