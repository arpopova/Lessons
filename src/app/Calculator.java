package app;

public class Calculator {

    public static int addNumbers(int numOne, int numTwo) {

        return numOne + numTwo;
    }

    public static int subtractNambers(int numOne, int numTwo) {
        int result = 0;
        result = numOne - numTwo;
        return result;
    }

    public static int divideNambers(int numOne, int numTwo) {
        int result = -1;
        if (numTwo != 0) {
            result = numOne / numTwo;

        }
        return result;
    }

    public static int multiplyNumbers(int numOne, int numTwo) {

        return numOne * numTwo;
    }

    public static void main(String[] args) {
        int result;
        int firstNum = 8;
        int secondNum = 4;
        int thirdNum = 0;

        result = addNumbers(firstNum,secondNum);
        System.out.println(result);
        result = subtractNambers(firstNum,secondNum);
        System.out.println(result);
        result = divideNambers(firstNum,secondNum);
        System.out.println(result);
        result = multiplyNumbers(firstNum,secondNum);
        System.out.println(result);

    }




}