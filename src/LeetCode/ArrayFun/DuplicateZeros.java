package LeetCode.ArrayFun;

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for (int i=0; i<arr.length-1 ; i++){
            if (arr[i]==0){
                for (int j=arr.length-1 ; j>i; j-- ){
                    arr[j]= arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }

        }

        System.out.println("check :"+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] num = {1,0,2,3,0,4,5,6};
        duplicateZeros(num);
    }
}
