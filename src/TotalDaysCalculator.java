import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TotalDaysCalculator {

    public static int getTotalDaysOfMonth(Month month, List<String> dayNames) {
        int year = 2024; // Replace with the desired year

        // Initialize start and end dates for the month
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.plusMonths(1).minusDays(1);

        int totalDays = 0;

        // Iterate through each day in the month
        while (!start.isAfter(end)) {
            // Check if the current day is in the provided day names list
            if (dayNames.contains(start.getDayOfWeek().toString())) {
                totalDays++;
            }
            start = start.plusDays(1);
        }

        return totalDays;
    }

    public static void main(String[] args) {
        Month month = Month.FEBRUARY; // Replace with the desired month
        List<String> dayNames = List.of("SATURDAY", "SUNDAY"); // Replace with the desired day names

        int totalDays = getTotalDaysOfMonth(month, dayNames);

        System.out.println("Total days in " + month + " with day names " + dayNames + ": " + totalDays);
    }
}
