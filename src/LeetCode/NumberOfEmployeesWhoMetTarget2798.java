package LeetCode;

public class NumberOfEmployeesWhoMetTarget2798 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for(int i=0; i<hours.length; i++){
            if(hours[i] >= target){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] hours ={0,1,2,3,4,5};
        int target = 3;
        int testResult = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(testResult);
    }
}
