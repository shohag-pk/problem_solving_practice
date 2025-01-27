package DSA_Practice.Sorting_Algorithm;

public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
            int i = 0;
            int j =  nums.length;

            while (i<j){
                int correct = nums[i];
                if (nums[i]<j && nums[i]!=nums[correct]){
                    swap(nums, i, correct);
                }
                else {
                    i++;
                }
            }

            for (int index = 0; index < j; index++) {
                if (nums[index]!=index){
                    return index;
                }
            }

            return j;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,8,9,10};
        System.out.println(missingNumber(arr));
    }
}
