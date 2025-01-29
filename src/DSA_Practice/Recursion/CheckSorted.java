package DSA_Practice.Recursion;

public class CheckSorted {
    static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,65,7,8,9};
        System.out.println(isSorted(arr,0));
    }
}
