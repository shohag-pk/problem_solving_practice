package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetIndices2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();
        int low = 0;
        int high = nums.length -1;
        int mid;

        Arrays.sort(nums);

        while (low<=high){
            mid = low+(high-low)/2;

            if (nums[mid]==target){
                result.add(mid);
            }

            if (nums[mid] < target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        if (result.size()>0){
            Collections.sort(result);
            System.out.println(result);
            return result;
        }
        else {
            System.out.println(new ArrayList<>());
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        int nums[] = {100,1,100};
        targetIndices(nums,100);
    }
}
