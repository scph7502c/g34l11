package task5;

import java.time.Month;

public class SeasonFinder {
    public static void printCurrentSeason(Month month) {
        Season season = SeasonByMonth.getSeasonByMonth(month);
        System.out.println("Aktualna pora roku dla miesiąca " + month + " to: " + season);
    }
}