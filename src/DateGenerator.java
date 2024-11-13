import java.time.LocalDate;
import java.util.ArrayList;

public class DateGenerator {

    public static ArrayList<LocalDate> getAllDatesOfMonth(int year, int month) {
        ArrayList<LocalDate> dates = new ArrayList<>();
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.plusMonths(1).minusDays(1);

        while (!start.isAfter(end)) {
            dates.add(start);
            start = start.plusDays(1);
        }

        return dates;
    }

    public static void main(String[] args) {
        int year = 2024; // Replace with the desired year
        int month = 2;   // Replace with the desired month

        ArrayList<LocalDate> allDates = getAllDatesOfMonth(year, month);

        // Print the dates
        for (LocalDate date : allDates) {
            System.out.println(date);
        }
    }
}

