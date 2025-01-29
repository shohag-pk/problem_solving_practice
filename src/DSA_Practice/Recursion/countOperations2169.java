package DSA_Practice.Recursion;

public class countOperations2169 {
    public static int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }

    public static int helper(int num1, int num2, int step){
        if (num1 == 0 || num2 == 0){
            return step;
        }

        if (num1 >= num2){
            num1 = num1-num2;
           return helper(num1,num2,step+1);
        }

        return helper(num1, num2-num1, step+1);
    }

    public static void main(String[] args) {
        System.out.println(countOperations(2,3));
    }
}
