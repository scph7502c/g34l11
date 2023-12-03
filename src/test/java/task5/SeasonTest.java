package task5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeasonTest {

    @Test
    public void testGetSeasonByMonth() {
        assertEquals(Season.WINTER, SeasonByMonth.getSeasonByMonth(Month.DECEMBER));
        assertEquals(Season.WINTER, SeasonByMonth.getSeasonByMonth(Month.JANUARY));
        assertEquals(Season.WINTER, SeasonByMonth.getSeasonByMonth(Month.FEBRUARY));

        assertEquals(Season.SPRING, SeasonByMonth.getSeasonByMonth(Month.MARCH));
        assertEquals(Season.SPRING, SeasonByMonth.getSeasonByMonth(Month.APRIL));
        assertEquals(Season.SPRING, SeasonByMonth.getSeasonByMonth(Month.MAY));

        assertEquals(Season.SUMMER, SeasonByMonth.getSeasonByMonth(Month.JUNE));
        assertEquals(Season.SUMMER, SeasonByMonth.getSeasonByMonth(Month.JULY));
        assertEquals(Season.SUMMER, SeasonByMonth.getSeasonByMonth(Month.AUGUST));

        assertEquals(Season.AUTUMN, SeasonByMonth.getSeasonByMonth(Month.SEPTEMBER));
        assertEquals(Season.AUTUMN, SeasonByMonth.getSeasonByMonth(Month.OCTOBER));
        assertEquals(Season.AUTUMN, SeasonByMonth.getSeasonByMonth(Month.NOVEMBER));
    }

    @Test
    public void testPrintCurrentSeason() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        SeasonFinder.printCurrentSeason(Month.DECEMBER);
        String expectedOutput = "Aktualna pora roku dla miesiąca DECEMBER to: WINTER";

        assertEquals(expectedOutput, outputStream.toString().trim());
        System.setOut(System.out);
    }
}