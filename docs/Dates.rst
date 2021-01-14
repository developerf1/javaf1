-------------------
Dates
-------------------

Date and time related utility functions.

today
=====

    .. code-block:: java

        Date today = Dates.today();


    Returns today's date as a Date object. `Source <https://javaf1.com/snippet/get-actual-date-in-java>`_

    :returns: Date

todayAsString
=============

    .. code-block:: java

        String today = Dates.todayAsString("yyyy-MM-dd");


    Returns the today's date as a string formatted as specified by the formatString parameter. `Source <https://javaf1.com/snippet/get-actual-date-in-java>`_

    :formatString: Date formatting pattern.
    :returns: String


todayAsIsoString
================

    .. code-block:: java

        String today = Dates.todayAsIsoString();


    Returns today's date as string formatted in the ISO format: 2020-11-27. `Source <https://javaf1.com/snippet/get-actual-date-in-java>`_

    :returns: String

yesterday
=========

    .. code-block:: java

        LocalDate yesterday = Dates.yesterday();


    Returns yesterday's date as a LocalDate object. `Source <https://javaf1.com/snippet/get-yesterdays-date-in-java>`_

    :returns: LocalDate

yesterdayAsString
=================

    .. code-block:: java

        String yesterday = Dates.yesterdayAsString("yyyy-MM-dd");


    Returns yesterday's date as a string formatted according to the given format string. `Source <https://javaf1.com/snippet/get-yesterdays-date-in-java>`_

    :formatString: Date formatting pattern.
    :returns: String

yesterdayAsIsoString
====================

    .. code-block:: java

        String yesterday = Dates.yesterdayAsIsoString();


    Returns yesterday's date as a string formatted in ISO format. 2020-11-27. `Source <https://javaf1.com/snippet/get-yesterdays-date-in-java>`_

    :returns: String

tomorrow
=========

    .. code-block:: java

        LocalDate tomorrow = Dates.tomorrow();


    Returns tomorrow's date as a LocalDate object. `Source <https://javaf1.com/snippet/get-tomorrows-date-in-java>`_

    :returns: LocalDate

tomorrowAsString
=================

    .. code-block:: java

        String tomorrow = Dates.tomorrowAsString("yyyy-MM-dd");


    Returns tomorrow's date as a string formatted according to the given format string. `Source <https://javaf1.com/snippet/get-tomorrows-date-in-java>`_

    :formatString: Date formatting pattern.
    :returns: String

tomorrowAsIsoString
====================

    .. code-block:: java

        String tomorrow = Dates.tomorrowAsIsoString();


    Returns tomorrow's date as a string formatted in ISO format. 2020-11-27. `Source <https://javaf1.com/snippet/get-tomorrows-date-in-java>`_

    :returns: String


getDaysBetweenDates
===================

    .. code-block:: java

        long diffInDays = Dates.getDaysBetweenDates("2020-11-03", "2020-12-15");


    Gets the number of days between two dates. `Source <https://javaf1.com/snippet/get-the-number-of-days-between-two-dates-in-java>`_

    :startDate: Start date as string.
    :endDate: End date as string.
    :returns: String
