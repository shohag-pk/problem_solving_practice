package codeforce;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4};
        int sum = 0;

        //int storeArray [] = new int[numbers.length];
        ArrayList storeList = new ArrayList();

        for (int i=0; i< numbers.length; i++){
                sum = sum + numbers[i];
               storeList.add(sum);
        }

        storeList.forEach(System.err::println);
        System.out.println("Test :"+ storeList.toArray());
    }





}
