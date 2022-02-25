package katas.katas.CalculatorKata;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double total;

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void getSum(double number1) {
        total += number1;
    }

    public void getExtract(double number1) {
        total -= number1;
    }

    public void getMultiply(double number1) {
        total *= number1;
    }

    public void getDivide(double number1) {
        total /= number1;
    }

    public void percentageOf(double percentage) {
        total = total * percentage / 100;
    }

    public boolean isEven(double number1) {
        if (number1 % 2 == 0) return true;
        return false;
    }

    public double getGreater(double number1, double number2) {
        if (number1 > number2) return number1;
         return number2;
    }

    public void getArraySum(int[] array) {
            for (int i = 0; i < array.length; i++)
                total +=array[i];
        }

    public List getArrayFromFive(List<Integer> numbers) {
        List<Integer> filteredList = new ArrayList<>();
        for ( int number : numbers) {
            if (number >= 5)
                filteredList.add(number);
        } return filteredList;
    }
}
