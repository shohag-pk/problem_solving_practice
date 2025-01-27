package DSA_Practice.Sorting_Algorithm;

public class FirstMissingPositive41 {
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int j =  nums.length;

        while (i<j){
            int correct = nums[i]-1;
            if (nums[i] >0 && nums[i]<=j && nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < j; index++) {
            if (nums[index]!=index+1){
                return index+1;
            }
        }

        return j+1;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
