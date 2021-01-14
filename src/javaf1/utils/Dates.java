package javaf1.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Dates {

    private static final String ISO_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * Returns the today's date
     *
     * @see <a href="https://javaf1.com/snippet/get-actual-date-in-java">Get actual date</a>
     *
     * @return Date
     */
    public static Date today() {
        return new Date();
    }

    /**
     * Returns the today's date as a string formatted as specified by the formatString parameter
     *
     * @see <a href="https://javaf1.com/snippet/get-actual-date-in-java">Get actual date</a>
     *
     * @param formatString Format string
     *
     * @return String
     */
    public static String todayAsString(String formatString) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatString);
        return formatter.format(new Date());
    }

    /**
     * Returns the today's date as a string formatted in ISO format. 2020-11-27
     *
     * @see <a href="https://javaf1.com/snippet/get-actual-date-in-java">Get actual date</a>
     *
     * @return String
     */
    public static String todayAsIsoString() {
        SimpleDateFormat formatter = new SimpleDateFormat(ISO_DATE_FORMAT);
        return formatter.format(new Date());
    }

    /**
     * Returns yesterday's date as a LocalDate object
     *
     * @see <a href="https://javaf1.com/snippet/get-yesterdays-date-in-java">Get yesterday's date</a>
     *
     * @return LocalDate
     */
    public static LocalDate yesterday() {
        LocalDate today = LocalDate.now();
        return today.minusDays(1);
    }

    /**
     * Returns yesterday's date as a string formatted according to the given format string
     *
     * @see <a href="https://javaf1.com/snippet/get-yesterdays-date-in-java">Get yesterday's date</a>
     *
     * @param formatString
     *
     * @return LocalDate
     */
    public static String yesterdayAsString(String formatString) {
        LocalDate today = LocalDate.now();
        return (today.minusDays(1)).format(DateTimeFormatter.ofPattern(formatString));
    }

    /**
     * Returns yesterday's date as a string formatted in ISO format. 2020-11-27
     *
     * @see <a href="https://javaf1.com/snippet/get-yesterdays-date-in-java">Get yesterday's date</a>
     *
     * @return LocalDate
     */
    public static String yesterdayAsIsoString() {
        LocalDate today = LocalDate.now();
        return (today.minusDays(1)).format(DateTimeFormatter.ISO_DATE);
    }

    /**
     * Returns tomorrows's date as a LocalDate object
     *
     * @see <a href="https://javaf1.com/snippet/get-tomorrows-date-in-java">Get tomorrow's date</a>
     *
     * @return LocalDate
     */
    public static LocalDate tomorrow() {
        LocalDate today = LocalDate.now();
        return today.plusDays(1);
    }

    /**
     * Returns tomorrows's date as a string formatted according to the given format string
     *
     * @see <a href="https://javaf1.com/snippet/get-tomorrows-date-in-java">Get tomorrow's date</a>
     *
     * @param formatString
     *
     * @return String
     */
    public static String tomorrowAsString(String formatString) {
        LocalDate today = LocalDate.now();
        return (today.plusDays(1)).format(DateTimeFormatter.ofPattern(formatString));
    }

    /**
     * Returns tomorrows's date as a string formatted in ISO format. 2020-11-27
     *
     * @see <a href="https://javaf1.com/snippet/get-tomorrows-date-in-java">Get tomorrow's date</a>
     *
     * @return String
     */
    public static String tomorrowAsIsoString() {
        LocalDate today = LocalDate.now();
        return (today.plusDays(1)).format(DateTimeFormatter.ISO_DATE);
    }

    /**
     * Gets the number of days between two dates
     *
     * @see <a href="https://javaf1.com/snippet/get-the-number-of-days-between-two-dates-in-java">Get days between dates</a>
     *
     * @param startDate
     * @param endDate
     *
     * @return long
     */
    public static long getDaysBetweenDates(String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        return DAYS.between(start, end);
    }

}
