package LeetCode;

public class BusyStudent1450 {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i <startTime.length ; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]){
                count += 1;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        busyStudent(startTime,endTime,4);
    }
}
