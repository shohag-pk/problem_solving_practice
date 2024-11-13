package LeetCode;

public class ThreeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] num) {
        int count = 0;
        for (int i=0;i<num.length;i++){
            if (num[i]%2 != 0){
                count++;
            }else {
                count=0;
            }
            if (count==3){
                break;
            }
        }
        if (count==3) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,1,1};
        boolean b = threeConsecutiveOdds(num);
        System.out.println(b);
    }
}
