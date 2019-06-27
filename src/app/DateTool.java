package app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTool {

    // For Remote Git
    public static Date addHoursToNow(int hoursToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();
    }

    public static Date addMinuteToNow(int minutesToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE, minutesToAdd);
        return calendar.getTime();

    }

    public static Date addDayToNow(int daysToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
        return calendar.getTime();
    }

    public static Date addDayToNow1(int daysToAdd) {
        int hours = 24 * daysToAdd;
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR, hours);
        return calendar.getTime();
    }

    public static Date addYearsToNow(int yearsToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.YEAR, yearsToAdd);
        return calendar.getTime();
    }

    public static String dateToString(Date myDate) {
        Date date = new Date();
        date = myDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);

    }

    public static Date stringToDate(String myStringDate) {
        String string = myStringDate;
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d,yyyy");
        Date date = null;
        try {
            date = formatter.parse(string);
        } catch (Exception e) {
            System.out.println("Unable to convert string to date " + myStringDate + "; " + e);
        }
            return date;


    }

}
