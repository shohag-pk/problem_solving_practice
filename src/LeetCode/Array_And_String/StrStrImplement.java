package LeetCode.Array_And_String;

public class StrStrImplement {
    public static int strStr(String haystack, String needle) {
        System.out.println(haystack.indexOf(needle));
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack="dbadbutdad";
        String needle = "but";
        strStr(haystack,needle);
    }
}
