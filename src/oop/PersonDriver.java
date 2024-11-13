package oop;

public class PersonDriver {

    public static int nonRepeat(String s){
        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i) != s.charAt(i+1)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s ="aabb";
        System.out.println(nonRepeat(s));

    }
}
