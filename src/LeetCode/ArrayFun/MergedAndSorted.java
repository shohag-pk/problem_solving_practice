package LeetCode.ArrayFun;

import java.util.Arrays;

public class MergedAndSorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int numLength1 = m+n - 1;
        int numLength2 = n-1;
      /*  int l = nums1.length;
        int idx = l - 1;
        int [] result = new int[l];
        int i = 0, j = l - 1;*/

        for (int k=numLength1; k>=m; k--){
            nums1[k] = nums2[numLength2];
            numLength2--;
        }
        Arrays.sort(nums1);
      /*  while(idx >= 0){
            if(nums1[i] > nums1[j]){
                result[idx--] = nums1[i];
                i++;
            }else{
                result[idx--] = nums1[j];
                j--;
            }
        }*/
        System.out.println("test "+ Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n=3;

        merge(nums1,m,nums2,n);
    }
}
