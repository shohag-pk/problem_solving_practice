package casting;

public class TestCast {
    public static void main(String[] args) {
        B ab = new B();
        A a = ab;
        System.out.println(a.getId());
        B b = (B) a;
        System.out.println(b.age);
    }
}
