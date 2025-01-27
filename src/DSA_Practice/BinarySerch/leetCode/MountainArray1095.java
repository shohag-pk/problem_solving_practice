package DSA_Practice.BinarySerch.leetCode;

public class MountainArray1095 {
    public static int findInMountainArray(int target, int[] arr) {
        int peakIndex = peakIndexInMountainArray(arr);
        int firstIndex = binarySearch(arr, target, 0, peakIndex);
        if (firstIndex != -1) {
            return firstIndex;
        }

        return binarySearch(arr, target, peakIndex+1, arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {


        boolean isAscending = false;
        if (arr[start] < arr[end]) {
            isAscending = true;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }


        // for target => the smallest number
        int index ;
        if (isAscending) {
            index = start;
        }else {
            index = end;
        }


        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(findInMountainArray(target,arr));
    }
}
