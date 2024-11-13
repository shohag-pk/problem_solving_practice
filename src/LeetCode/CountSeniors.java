package LeetCode;

public class CountSeniors {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (int i=0; i< details.length ; i++){
            String element = details[i];
            String ageString = element.substring(11, 13);
            int age = Integer.parseInt(ageString);
            if (age>60){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] details = {"1313579440F2036","2921522980M5644"};
        int result = countSeniors(details);
        System.out.println(result);

    }
}
