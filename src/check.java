public class check {
    public static void main(String[] args) {
        int catWiseMonthlyTarget = 160;
        int saleTillDate = 34;
        int workingDayLeft = 8;
       int  target = (catWiseMonthlyTarget - saleTillDate) / (workingDayLeft - 1 == 0 ? 1 : workingDayLeft);
        System.out.println(target);
        System.out.println("hello"+5+3);
    }
}
