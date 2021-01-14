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

