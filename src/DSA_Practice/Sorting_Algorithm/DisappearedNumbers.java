package DSA_Practice.Sorting_Algorithm;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int j =  nums.length;

        List<Integer> ans = new ArrayList<>();
        while (i<j){
            int correct = nums[i] -1;
            if (nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }


        for (int index = 0; index < j; index++) {
            if (nums[index] != index+1){
                 ans.add(index+1);
            }
        }

        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
