package DSA_Practice.Recursion;

public class NumberOfSteps1342 {
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int step){
        if (num == 0){
            return step;
        }

        if(num % 2 ==0){
            return helper(num/2, step+1);
        }

        return helper(num-1, step+1);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}
