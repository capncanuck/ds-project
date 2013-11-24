package org.SOFE_4790U.project.group11.models;

import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Shows the current time as XML
 * 
 * @author Khalil Fazal
 */
@XmlRootElement
@XmlType(propOrder = {
    "timezone", "year", "month", "day", "hour", "minute", "second", "millisecond"
})
public class Time {

    /**
     * The time zone
     */
    private final String timezone;

    /**
     * The year
     */
    private final int year;

    /**
     * The month
     */
    private final int month;

    /**
     * The day
     */
    private final int day;

    /**
     * The hour
     */
    private final int hour;

    /**
     * The minute
     */
    private final int minute;

    /**
     * The second
     */
    private final int second;

    /**
     * The millisecond
     */
    private final int millisecond;

    /**
     * Set to a timezone
     * 
     * @param timezone a timezone specified
     */
    public Time(final TimeZone timezone) {
        final Calendar now = Calendar.getInstance(timezone);

        this.timezone = now.getTimeZone().getDisplayName();
        this.year = now.get(Calendar.YEAR);
        this.month = now.get(Calendar.MONTH) + 1;
        this.day = now.get(Calendar.DATE);
        this.hour = now.get(Calendar.HOUR);
        this.minute = now.get(Calendar.MINUTE);
        this.second = now.get(Calendar.SECOND);
        this.millisecond = now.get(Calendar.MILLISECOND);
    }

    /**
     * Set to the default timezone
     */
    public Time() {
        this(TimeZone.getDefault());
    }

    /**
     * @return the timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return this.day;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return this.hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return this.minute;
    }

    /**
     * @return the second
     */
    public int getSecond() {
        return this.second;
    }

    /**
     * @return the millisecond
     */
    public int getMilliSecond() {
        return this.millisecond;
    }
}