package interview;

public class Test {
    public static String name= "Java";
    public  String author= "James";

    static {
        System.out.println("Name in static block ; "+name);
        name= "Java programming ";
    }
    {
        System.out.println("Author is non static block : "+author);
        this.author = "James Gosling";
    }

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(name);
        System.out.println(test.author);

        test.author = "Rod Johnson";

        Test tt = new Test();
        System.out.println(test.author);
    }

}
