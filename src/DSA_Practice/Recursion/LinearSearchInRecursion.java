package DSA_Practice.Recursion;

import java.util.ArrayList;

public class LinearSearchInRecursion {

    static boolean linearSearch(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }

        return arr[index]==target || linearSearch(arr, target, index+1);
    }

    static int linearSearchIndex(int[] arr, int target, int index){

        if(index == arr.length){
            return -1;
        }

        if (arr[index]==target){
            return index;
        } else {
            return linearSearchIndex(arr, target, index+1);
        }


    }


    static ArrayList<Integer> indexList = new ArrayList<>();
    static void linearSearchIndexList(int[] arr, int target, int index){

        if(index == arr.length){
            return;
        }

        if (arr[index]==target){
            indexList.add(index);
        }
        linearSearchIndexList(arr, target, index+1);
    }

    static ArrayList<Integer> linearSearchIndexList2(int[] arr, int target, int index, ArrayList<Integer> indexList){

        if(index == arr.length){
            return indexList;
        }

        if (arr[index]==target){
            indexList.add(index);
        }
        return linearSearchIndexList2(arr, target, index+1, indexList);
    }

    static ArrayList<Integer> linearSearchIndexList3(int[] arr, int target, int index){

        ArrayList<Integer> indexList = new ArrayList<>();
        if(index == arr.length){
            return indexList;
        }

        if (arr[index]==target){
            indexList.add(index);
        }
        ArrayList<Integer> previousArrayList = linearSearchIndexList3(arr, target, index + 1);
        indexList.addAll(previousArrayList);
        return indexList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7};
        int target = 4;
        linearSearchIndexList(arr,target,0);
       // System.out.println(linearSearchIndexList(arr,target,0));
        System.out.println(linearSearchIndexList3(arr,target,0));
       // System.out.println(indexList);
    }
}
