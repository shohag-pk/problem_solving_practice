package DSA_Practice.BinarySerch;

public class InfiniteArray {

    static int infiniteArray(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums,target,start,end);
    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        int ans = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }  else if (nums[mid] < target) {
                start = mid + 1;
            } else {
               return mid;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(infiniteArray(nums,target));
    }
}
