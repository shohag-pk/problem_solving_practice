package LeetCode.ArrayFun;

import java.util.Arrays;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int l = arr.length -1;
        System.out.println("Length :"+l);
        int i=1;
        int con = 0;
        boolean isValidL = false;
        boolean isValidR = false;
        if (arr.length<3){
            System.out.println(false);
            return false;
        }
        while (i<=l){
            if (arr[i]>arr[i-1]){
                i++;
                con++;
                isValidL=true;
            }
            else {
                if (arr[i]==arr[i-1]){
                    isValidL = false;
                    break;
                }
                break;

            }
        }
        if (con==0){
            System.out.println(false);
            return false;
        }
        while (con<=l){
            if (arr[l]<arr[l-1]){
                l--;
                isValidR = true;
            }
            else {
                if (arr[l]==arr[l-1]){
                    isValidR = false;
                    break;
                }
                break;
            }
        }
        System.out.println("Con :"+con);

        if (con==l && isValidL && isValidR){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;


       /* int l = arr.length -1;
        int i=1;
        int con = 0;
        boolean isValidL = false;
        boolean isValidR = false;
        while (i<=l){
            if (arr[i]>arr[i-1]){
                i++;
                con++;
                isValidL=true;
            }
            else {
                if (arr[i]==arr[i-1]){
                    isValidL = false;
                    break;
                }
                break;

            }
        }
        while (con<l){
            if (arr[l]<arr[l-1]){
                l--;
                isValidR = true;
            }
            else {
                if (arr[l]==arr[l-1]){
                    isValidR = false;
                    break;
                }
                break;
            }
        }
        if (isValidL && isValidR){
            return true;
        }
        return false;*/
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        validMountainArray(arr);
    }
}
