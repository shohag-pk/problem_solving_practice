package LeetCode.ArrayFun;

public class FindNumbersEven {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length ; i++){
            String num = Integer.toString(nums[i]);
            int digit = num.length();
            if (digit % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        findNumbers(nums);
    }
}
