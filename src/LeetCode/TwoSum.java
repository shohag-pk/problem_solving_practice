package LeetCode;



public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        /*int sum = 0;
        int result[] = new int[2];
        for(int i=0; i<nums.length -1; i++){
            sum = nums[i]+nums[i+1];

            if(sum==target){
                return new int [] {i,i+1};
            }
        }

        throw new IllegalArgumentException("not match");*/

        int sum = 0;
        for(int j= 0; j<nums.length ; j++){
            for(int i=j+1; i<nums.length; i++){
                sum = nums[j]+nums[i];

                if(sum==target){
                    return new int [] {j,i};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int nums[] = {3,2,4};

        int[] ints = twoSum.twoSum(nums, 6);
        //System.out.println(ints);
        for (int k=0; k<ints.length; k++){
            System.out.print(ints[k]);
        }

    }
}
