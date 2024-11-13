package random;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] nums , int s, int e){
        int temp;
        while (s < e){
            temp = nums[s];
            nums[s]= nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,6};

        System.out.println(Arrays.toString(reverseArray(num, 0,num.length-1)));
    }
}
