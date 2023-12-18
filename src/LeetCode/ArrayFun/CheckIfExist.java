package LeetCode.ArrayFun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        /*int l = arr.length - 1;
        for (int i=0; i<=l ; i++){
            for (int j=0; j<=l ; j++){
                if ((i != j) && (arr[i]==2*arr[j])){
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;*/

        int l = arr.length - 1;
        List<Integer> check = new ArrayList<>();
        for (int c=0; c<=l; c++){
            check.add(arr[c]);
        }
        for (int j=0; j<=l ; j++){
            int index = check.indexOf(check.contains(arr[j] / 2));
            System.out.println("index :"+index);
            boolean p = arr[j] % 2 == 0;
            if(j != check.indexOf(check.contains(arr[j] / 2)) && p && check.contains(arr[j] / 2)){
                System.out.println("true");
                return true;
            }
        }

        System.out.println("false");
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {0,0};
        checkIfExist(arr);
    }
}
