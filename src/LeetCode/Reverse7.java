package LeetCode;

public class Reverse7 {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }

        long reversedNumber = 0;  // Use long to handle larger values during computation

        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }
        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            reversedNumber = 0;
        }

        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        return (int)reversedNumber;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        reverse(x);
        System.out.println(reverse(x));
    }
}
