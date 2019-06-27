package app;

import java.util.Date;

import static app.Calculator.*;
import static app.DateTool.*;

public class main {
    public static void main(String[] args) {
        int result;
        int firstNum = 8;
        int secondNum = 4;
        Date hours = null;
        Date days = null;
        Date dayOfYear = null;
        Date minute = null;
        Date years = null;


        result = addNumbers(firstNum, secondNum);
        System.out.println(result);
        result = subtractNambers(firstNum, secondNum);
        System.out.println(result);
        result = divideNambers(firstNum, secondNum);
        System.out.println(result);
        result = multiplyNumbers(firstNum, secondNum);
        System.out.println(result);

        hours = addHoursToNow(3);
        System.out.println(hours);
        days = addDayToNow1(2);
        System.out.println(days);

        minute = addMinuteToNow(10);
        System.out.println(minute);
        dayOfYear = addDayToNow(5);
        System.out.println(dayOfYear);
        years = addYearsToNow(5);
        System.out.println(years);

        Date myDtDate = stringToDate("September 6, 2005");
        System.out.println(myDtDate);

        String myDate = dateToString(myDtDate);
        System.out.println(myDate);

    }

    }


