package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        int i =0;
        int lenth= nums.length-1;
        Map<Integer,Integer> duplicateCheck = new HashMap<>() ;
        while (i<=lenth){
            duplicateCheck.put(nums[i],i);
            i++;
        }
        int size = duplicateCheck.size();
       Object[] inte;
        inte = duplicateCheck.keySet().toArray();
        int num[] = new int[size];
        int l = num.length;
        for (int k=0;k<l;k++){
            num[k]= ((int) inte[k]);
        }
        System.out.println(Arrays.toString(num));
        int first = num[0];
        for (int c=0;c<l; c++) {
            if (first<num[c]){
                first=num[c];
            }
        }
       int second =Integer.MIN_VALUE;
        for (int d=0;d<l; d++) {
            if (second<num[d]&& num[d]<first){
                second=num[d];
            }
        }
        int third =Integer.MIN_VALUE;
        for (int f=0;f<l; f++) {
            if (third<num[f]&& num[f]<second){
                third=num[f];
            }
        }
        if (l<3){
            System.out.println(first);
            return first;
        }
        System.out.println(third);
        return third;
    }

    public static void main(String[] args) {
        int num[] = {4,3,3,4,3,3,3,3,3};
        thirdMax(num);
    }
}
