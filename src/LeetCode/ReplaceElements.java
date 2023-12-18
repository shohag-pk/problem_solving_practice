package LeetCode;

import java.util.Arrays;

public class ReplaceElements {
    public static int[] replaceElements(int[] arr) {
        int l = arr.length-1;
        int max = -1;
        if (arr.length==1){
            arr[0]= -1;
        }
        for (int i =l; i>=1; i--){
            if (max<arr[i-1]){
                max=arr[i-1];
            }
            arr[i-1] = max;
            System.out.println(arr[i]);
        }
        for (int j=1; j<=l;j++){
            arr[j-1]=arr[j];
        }
        arr[l]=-1;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
    }
}
