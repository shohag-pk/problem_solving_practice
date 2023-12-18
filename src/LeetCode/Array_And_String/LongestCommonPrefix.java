package LeetCode.Array_And_String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String result = "";
        boolean flag = false;
        for (int i=0;i< strs[0].length();i++){
            for (int j=0; j<strs.length; j++){
                if (strs[j].charAt(i)==strs[0].charAt(i)){
                    flag=true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                result = result+strs[0].charAt(i);
            }
            else {
                break;
            }
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        String[] str = {"abab","aba","abc"};
        longestCommonPrefix(str);
    }
}
