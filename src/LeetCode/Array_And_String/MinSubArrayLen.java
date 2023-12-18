package LeetCode.Array_And_String;

import java.util.ArrayList;
import java.util.List;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        /*int length = nums.length;
        int size = Integer.MAX_VALUE;
        int sum =0 ;
        boolean flag=false;
        List<Integer> newSub = new ArrayList<>();
        for (int i =0; i<length; i++){
                for (int k=i; k<length; k++) {
                    sum += nums[k];
                    newSub.add(nums[k]);
                    if (sum >= target) {
                        flag = true;
                        if (size > newSub.size()) {
                            size = newSub.size();
                        }
                        break;
                    }
                }
                sum =0;
                newSub.removeAll(newSub);

        }

        if (flag){
            System.out.println(size);
            return size;
        }
        else {
            System.out.println(0);
            return 0;
        }*/


        int n = nums.length;
        int size = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum >= target) {
                    size = Math.min(size, (j - i + 1));
                    break;
                }
            }
        }
        return (size != Integer.MAX_VALUE) ? size : 0;
    }


    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int target = 5;
        minSubArrayLen(target,num);

    }
}
