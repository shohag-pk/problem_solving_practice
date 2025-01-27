package DSA_Practice.Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        int j = arr.length;
        while (i<j){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        //bubbleSort(arr);
        //selection(arr);
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
