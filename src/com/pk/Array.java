package com.pk;

public class Array {
    public static int findIndex(int x[], int y){

       /* if (x == null){
            throw new NullPointerException("It's null");
        }*/

        int length = x.length;
        System.out.println("element :"+length);

        for (int i=length-1; i>0; i-- ){
            if (x[i] == y){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int num [] ={};
        int y=1;
        int result = findIndex(num, y);
        System.out.println(result);
    }
}
