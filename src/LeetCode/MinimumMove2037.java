package LeetCode;

import java.util.Arrays;

public class MinimumMove2037 {
    public static int minMovesToSeat(int[] seats, int[] students) {

       int move = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i <seats.length ; i++) {
            move += Math.abs(seats[i] - students[i]);
        }
        System.out.println(move);
        return move;
    }

    public static void main(String[] args) {
        int seat[] = {4,1,5,9};
        int students[] = {1,3,2,6};
        minMovesToSeat(seat, students);
    }
}
