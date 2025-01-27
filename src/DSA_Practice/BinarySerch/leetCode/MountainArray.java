package DSA_Practice.BinarySerch.leetCode;

public class MountainArray {
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
