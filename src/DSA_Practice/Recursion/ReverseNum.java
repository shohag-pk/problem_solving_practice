package DSA_Practice.Recursion;

public class ReverseNum {

    static int sum =0;

    public static void rev1(int num){
        if (num == 0){
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;

        rev1(num/10);
    }

    static int rev2(int n){

        int digit = (int) Math.log10(n);

        return helper(n, digit);
    }

    private static int helper(int n, int digit) {

        if (n%10 == n){
            return n;
        }

        int rem = n % 10;

        return rem * (int)Math.pow(10, digit) + helper(n/10, digit-1);
    }

    public static void main(String[] args) {
       /* rev1(1234);
        System.out.println(sum);*/
        System.out.println(rev2(4321));
    }
}
