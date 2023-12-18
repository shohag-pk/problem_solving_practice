package LeetCode.Array_And_String;

public class PivotIndex {

    public static int sumLeft(int[] nums, int l){
        int lsum=0;
        for (int i =l-1; i>=0; i--){
            if (l==0){
                return lsum;
            }
            lsum= lsum+nums[i];
        }
        return lsum;
    }

    public static int sumRight(int[] nums, int r){
        int rsum=0;
        for (int i =r+1; i<nums.length; i++){
            rsum= rsum+nums[i];
        }
        return rsum;
    }
    public static int pivotIndex(int[] nums) {
        int length = nums.length;

        for (int i =0;i<length;i++){
            if (sumLeft(nums,i)==sumRight(nums, i)){
                System.out.println(i);
                return i;
            }

        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        pivotIndex(nums);
    }
}
