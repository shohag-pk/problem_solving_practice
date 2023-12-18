package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<String,Integer> romanValue = new HashMap<String,Integer>();
        romanValue.put("I",1);
        romanValue.put("V",5);
        romanValue.put("X",10);
        romanValue.put("L",50);
        romanValue.put("C",100);
        romanValue.put("D",500);
        romanValue.put("M",1000);
        int sum = 0;


        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);

            if(i>0 && romanValue.get(String.valueOf(c)) > romanValue.get(String.valueOf(s.charAt(i - 1)))){

                sum = sum+romanValue.get(String.valueOf(c)) - 2*romanValue.get(String.valueOf(s.charAt(i - 1)));
            }
            else {
                sum = sum+romanValue.get(String.valueOf(c));
            }
        }

        System.out.println(sum);

        return sum;

    }

    public static void main(String[] args) {


        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("MCMXCIV");


    }





}
