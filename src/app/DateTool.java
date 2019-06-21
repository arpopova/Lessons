package app;

import java.util.Calendar;
import java.util.Date;

public class DateTool {
    public static Date addHoursToNow(int hoursToAdd) {
        Date now = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR,hoursToAdd);
        return calendar.getTime();
    }

    public static Date addMinuteToNow(int minutesToAdd) {
        Date now = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE,minutesToAdd);
        return calendar.getTime();

    }

    public static Date addDayToNow(int daysToAdd) {
        Date now = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR,daysToAdd);
        return calendar.getTime();
    }

    public static Date addDayToNow1(int daysToAdd) {
        int hours = 24*daysToAdd;
        Date now = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR,hours);
        return calendar.getTime();
    }
    public static Date addYearsToNow(int yearsToAdd) {
        Date now = new Date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.YEAR,yearsToAdd);
        return calendar.getTime();
    }
}
