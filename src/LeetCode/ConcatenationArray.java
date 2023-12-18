package LeetCode;

import java.util.Arrays;

public class ConcatenationArray {
    public static int [] concatenationOfArray(int array[]){

        int result[] = new int[2 * array.length];
        for (int i=0;i<array.length; i++){
            result[i]=array[i];
            result[i+array.length] = array[i];
        }

        return result;
    }

    public static int[] runningSum(int[] nums) {

        int result[] = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
            result[i] = sum;
        }

        return result;

    }

    public static int finalValueAfterOperations(String[] operations) {

        int X = 0;
        for (int i = 0; i<operations.length ; i++){
            if(operations[i] == "++X" || operations[i] == "X++")
            {
                X= X+1;
            }
            else{
                X= X-1;
            }
        }

        return X;
    }

    public static void main(String[] args) {
        String operation[] = {"--X","X++","X++"};
        int finalValue = finalValueAfterOperations(operation);
        System.out.println(finalValue);
        int arr[] = {1,2,3,4};
        int[] check = concatenationOfArray(arr);
        int[] runningSum = runningSum(arr);
       // System.out.println(Arrays.toString(runningSum));
    }
}
