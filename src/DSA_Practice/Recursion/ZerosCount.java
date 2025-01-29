package DSA_Practice.Recursion;

public class ZerosCount {

    static int zeroCountFunc(int n){
        return helperFun(n, 0);
    }

    static int helperFun(int n, int count){
        if (n==0){
            return count;
        }

        int rem = n%10;

        if (rem == 0){
            return helperFun(n/10, count+1);
        }

        return helperFun(n/10, count);
    }

    public static void main(String[] args) {
        System.out.println(zeroCountFunc(23030004));
    }
}
