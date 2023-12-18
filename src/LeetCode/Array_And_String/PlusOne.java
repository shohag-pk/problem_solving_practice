package LeetCode.Array_And_String;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
       /* String value = "";
        for (int i=0; i< digits.length; i++){
            value = value+digits[i];
        }
        Long aLong = Long.parseLong(value)+1;
        String avalue = aLong.toString();
        int length = avalue.length();
        int result[] = new int[length];
        for (int i=0; i<length; i++){
            result[i] = Integer.parseInt(String.valueOf(avalue.charAt(i)));
        }
        System.out.println(Arrays.toString(result));
        return result;*/

        /*String value = "";
        for (int i=0; i< digits.length; i++){
            value = value+digits[i];
        }
        Long aLong = Long.parseLong(value)+1;
        int idx= aLong.toString().length();
        int k=idx-1;
        int result[] = new int[idx];
        for (int i=0; i<idx; i++){
            long l = aLong % 10;
            result[k--]= (int) l;
            aLong = aLong/10;
        }
        System.out.println(Arrays.toString(result));
        return result;*/

        int length = digits.length;
        int i=0;

        for(i = length-1 ; i >= 0 ; i--){
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if(i == -1) {
            int[] newDigits = new int[length+1];
            newDigits[0] = 1;
            System.out.println(Arrays.toString(newDigits));
            return newDigits;
        }

        System.out.println(Arrays.toString(digits));
        return digits;
    }

    public static void main(String[] args) {
        int num[] = {9};
        plusOne(num);
    }
}
