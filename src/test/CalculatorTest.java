package test;

import app.Calculator;
import app.DateTool;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class CalculatorTest {

    int result;
    int firstNum = 8;
    int secondNum = 4;
    int thirdNum = 0;

    @Test
    public void calculationsTest(){
        Assert.assertEquals(1,1);
        Assert.assertEquals(12, Calculator.addNumbers(firstNum,secondNum));

    }

    @Test
    public void negativeCalculatorTest(){
        Assert.assertEquals(11,Calculator.addNumbers(firstNum,secondNum));
    }

    @Test

    public void formatDatesTest(){
        Date resultDate;

        resultDate= DateTool.addHoursToNow(1);
        System.out.println(resultDate);
        resultDate= DateTool.addMinuteToNow(5);
        System.out.println(resultDate);
        resultDate= DateTool.addDayToNow(30);
        System.out.println(resultDate);


    }
}
