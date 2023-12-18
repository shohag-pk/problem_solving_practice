package com.pk;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingArraySort {
    public static void main(String[] args) {

            // Your array
        // Your array
        int[] arr = {1, 4, -5, 6, -2};

        // Sort the array in descending order
        Arrays.sort(arr);

        // Reverse the order of elements
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
