package com.pk;

public class BinarySearch {

    int checkPosition(int a[], int searchNumber){
        int left = 0;
        int right = a.length -1;
        int mid;

        while (left <= right){
            mid = (left+right)/2;

            if(a[mid] == searchNumber){
                System.out.println("position number :"+mid);
                return mid;
            }
            if(a[mid] < searchNumber){
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = {10,15,30,40,50,60};
        int search = 90;
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.checkPosition(a,search);
    }
}
