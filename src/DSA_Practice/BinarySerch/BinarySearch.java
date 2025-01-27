package DSA_Practice.BinarySerch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

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

        // for floor
        /*int index ;
        if (isAscending) {
            index = end;
        }else {
            index = start;
        }*/

        return index;
    }

    public static void main(String[] args) {

      //  int[] arr = {11,9,8,7,5,4,3,2,1};
        int[] arr = {1,2,3,4,6,7,8,9,11};

        System.out.println(binarySearch(arr, 10));

    }
}
