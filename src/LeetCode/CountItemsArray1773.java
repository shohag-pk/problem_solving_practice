package LeetCode;

import java.util.Arrays;
import java.util.List;

public class CountItemsArray1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i <items.size() ; i++) {

                if (ruleKey.equals("type") && ruleValue.equals(items.get(i).get(0))){
                    count = count+1;
                }

           else if (ruleKey.equals("color") && ruleValue.equals(items.get(i).get(1))){
                count = count+1;
            }

           else if (ruleKey.equals("name") && ruleValue.equals(items.get(i).get(2))){
                count = count+1;
            }


        }

        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone","blue","pixel"),List.of("computer","silver","lenovo"), List.of("phone","gold","iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";

        countMatches(items,ruleKey,ruleValue);
    }
}
