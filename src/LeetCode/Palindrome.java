package LeetCode;

public class Palindrome {
    public boolean isPalindrome(int num){
       int reversedNum = 0, remainder;
        int originalNum = num;

        while (num > 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrome(121);
        System.out.println(palindrome.isPalindrome(121));
    }
}
