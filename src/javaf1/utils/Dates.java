package javaf1.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    /**
     * Returns the today's date
     *
     * @see <a href="/snippet/get-actual-date-in-java">Get actual date</a>
     *
     * @return Date
     */
    public static Date today() {
        return new Date();
    }

    /**
     * Returns the today's date as a string formatted as specified by the formatString parameter
     *
     * @see <a href="/snippet/get-actual-date-in-java">Get actual date</a>
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
     * @see <a href="/snippet/get-actual-date-in-java">Get actual date</a>
     *
     * @return String
     */
    public static String todayAsIsoString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }
}
