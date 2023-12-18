package LeetCode;

public class InsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int mid ;
        int tMid = 0;

        while (left <= right){
            mid = left+(right-left)/2;
            tMid = mid;
            if(nums[mid] == target){
                System.out.println("position number :"+mid);
                return mid;
            }


            if (nums[right] < target){
                System.out.println(right+1);
                return right + 1;
            }

            if(target>nums[left] && target < nums[left+1]){
                System.out.println(left+1);
                return left+1;
            }

            if(nums[mid] < target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }
        System.out.println(tMid);

        return tMid;
    }

    public static void main(String[] args) {
        int num[] = {1,3,6,9};
        searchInsert(num, 9);
    }
}
