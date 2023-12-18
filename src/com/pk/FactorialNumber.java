package com.pk;

public class FactorialNumber {
    public static String reverseString(String str){
        if(str.isEmpty()){
           return str;
        }
        else {
           return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
        }

    }

    public static void main(String[] args) {
        String str = "abcde";
        String result = reverseString(str);
        System.out.println(result);
    }
}
