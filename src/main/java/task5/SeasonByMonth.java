package task5;

import java.time.Month;

public class SeasonByMonth {

    public static Season getSeasonByMonth(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.AUTUMN;
            default:
                throw new IllegalArgumentException("Nieprawidłowy miesiąc: " + month);
        }
    }
}