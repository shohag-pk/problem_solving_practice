package LeetCode.Array_And_String;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i=0;
        int j = s.length-1;
       while (i<j){
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;
           i++;
           j--;
       }

        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h','e','k','l','o'};
        reverseString(s);
    }
}
