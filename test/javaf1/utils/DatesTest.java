package javaf1.utils;

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
}
