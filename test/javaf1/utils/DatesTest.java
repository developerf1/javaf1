package javaf1.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DatesTest {

    @org.junit.jupiter.api.Test
    void today() {
        Date today = Dates.today();

        assertNotNull(today);
    }

    @org.junit.jupiter.api.Test
    void testToday() {
        String today = Dates.todayAsString("yyyy-MM-dd");

        assertEquals("2021-01-14", today);
    }

    @org.junit.jupiter.api.Test
    void todayAsIsoString() {
        String today = Dates.todayAsIsoString();

        assertEquals("2021-01-14", today);
    }

    @Test
    void yesterday() {
        LocalDate yesterday = Dates.yesterday();

        assertEquals("2021-01-13", yesterday.format(DateTimeFormatter.ISO_DATE));
    }

    @Test
    void tomorrow() {
        LocalDate tomorrow = Dates.tomorrow();

        assertEquals("2021-01-15", tomorrow.format(DateTimeFormatter.ISO_DATE));
    }

    @Test
    void yesterdayAsString() {
        String yesterday = Dates.yesterdayAsString("yyyy-MM-dd");

        assertEquals("2021-01-13", yesterday);
    }

    @Test
    void yesterdayAsIsoString() {
        String yesterday = Dates.yesterdayAsIsoString();

        assertEquals("2021-01-13", yesterday);
    }

    @Test
    void tomorrowAsString() {
        String tomorrow = Dates.tomorrowAsString("yyyy-MM-dd");

        assertEquals("2021-01-15", tomorrow);
    }

    @Test
    void tomorrowAsIsoString() {
        String tomorrow = Dates.tomorrowAsIsoString();

        assertEquals("2021-01-15", tomorrow);
    }

    @Test
    void getDaysBetweenDates() {
        long diff = Dates.getDaysBetweenDates("2020-11-03", "2020-12-15");

        assertEquals(42, diff);
    }
}
