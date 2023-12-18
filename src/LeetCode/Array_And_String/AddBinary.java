package LeetCode.Array_And_String;

public class AddBinary {
    public static String addBinary(String a, String b) {
        if (a.length()<b.length()){
           for (int i=a.length();i<b.length();i++){
               a= '0'+a;
           }
        }
        else {
            for (int i=b.length();i<a.length();i++){
                b= '0'+b;
            }
        }
        String sum = "";
        char carry = '0';
        for (int i=a.length()-1; i>=0; i--){
            if (a.charAt(i)=='1' && b.charAt(i)=='1'){
                if (carry=='0') {
                    sum = "0" + sum;
                    carry = '1';
                }
                else {
                    sum = '1'+sum;
                    carry='1';
                }
            }

            else if (a.charAt(i)=='1' && b.charAt(i)=='0'){
                if (carry=='0') {
                    sum = "1" + sum;
                }
                else {
                    sum = '0'+sum;
                    carry='1';
                }
            }
            else if (a.charAt(i)=='0' && b.charAt(i)=='1'){
                if (carry=='0') {
                    sum = "1" + sum;
                }
                else {
                    sum = '0'+sum;
                    carry='1';
                }
            }
            else if (a.charAt(i)=='0' && b.charAt(i)=='0'){
                if (carry=='0') {
                    sum = "0" + sum;
                }
                else {
                    sum = '1'+sum;
                    carry='0';
                }
            }
        }
        if (!(carry=='0')){
            sum = '1'+sum;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        String a = "10001";
        String b = "1";

        addBinary(a,b);
    }
}
