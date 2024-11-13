package oop;

class TestEx {
    public static void main(String[] args) {
        String s1 = "Karim";
        String s2 = "Karim";


        String s3 = new String("Karim");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
    }
}
