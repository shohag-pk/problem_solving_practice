package LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high - low)/2;
            System.out.println(0/2);
            if(nums[mid]>mid) high=mid-1;
            else
                low=mid+1;
        }
        System.out.println(low);
        return low;
    }

    public static void main(String[] args) {

        int num[] = {0,3,1};
        missingNumber(num);
    }
}
