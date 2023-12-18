package LeetCode.Array_And_String;

public class DominantIndex {
    public static int dominantIndex(int[] nums) {
        int largest = 0;
        int index = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest= nums[i];
                index = i;
            }
        }
        for (int i=0;i<nums.length;i++){
            if (largest != nums[i] && 2*nums[i]>largest){
                System.out.println(-1);
                return -1;
            }
        }
        System.out.println(index);
        return index;
    }

    public static void main(String[] args) {
        int num[] = {0,1,3,1};
        dominantIndex(num);
    }
}
