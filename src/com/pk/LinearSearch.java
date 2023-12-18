package com.pk;

public class LinearSearch {


       public int searchValue(int arr[], int sNumber){
           for(int i=0; i<arr.length; i++){
               if(arr[i] == sNumber){
                   System.out.println("search Value "+ i);
                   return i;
               }
           }

           return -1;
        }

    public static void main(String[] args) {
         int a[] = {10,15,30,2,5,40};
         int sNumber =30;
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.searchValue(a,sNumber);

    }

}
