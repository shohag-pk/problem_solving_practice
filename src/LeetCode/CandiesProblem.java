package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CandiesProblem {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> check = new ArrayList<>();
        int result[] = new int[candies.length];
        int maxKid = 0;
        for (int i=0; i<candies.length; i++){
            if(maxKid<candies[i]){
                maxKid = candies[i];
            }
        }

        for (int i=0; i<candies.length; i++){
           result[i] = candies[i] + extraCandies;
           if (maxKid <= result[i]){
               check.add(true);
           }
           else {
               check.add(false);
           }
        }

        return check;
    }
    public static void main(String[] args) {

        int num[] = {4,2,1,1,2,20};
        int extraCan = 1;

        List<Boolean> withCandies = kidsWithCandies(num, extraCan);
        System.out.println(withCandies);
    }
}
