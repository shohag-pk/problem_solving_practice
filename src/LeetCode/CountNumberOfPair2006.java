package LeetCode;

public class CountNumberOfPair2006 {
    public static int countKDifference(int[] nums, int k) {

        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j < nums.length; j++) {
                if(Math.abs(nums[i] - nums[j]) == k){
                    count += 1;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,4};
        int k = 2;
        countKDifference(nums, k);
    }
}
