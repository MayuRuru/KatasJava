package katas.katas.CalculatorKata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    void calculatorStartsWithTotalEqualZero(){
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal(), equalTo(0.0));
    }

    @Test
    void calculatorSumsToTotal(){
        Calculator calculator = new Calculator();
        double number1 = 4.5;
        calculator.getSum(number1);
        assertThat(calculator.getTotal(), equalTo(4.5));
    }

    @Test
    void calculatorExtractsToTotal(){
        Calculator calculator = new Calculator();
        double number1 = 4.5;
        calculator.getExtract(number1);
        assertThat(calculator.getTotal(), equalTo(-4.5));
    }

    @Test
    void calculatorMultipliesToTotal(){
        Calculator calculator = new Calculator();
        calculator.setTotal(2);
        double number1 = 2;
        calculator.getMultiply(number1);
        assertThat(calculator.getTotal(), equalTo(4.0));
    }

    @Test
    void calculatorDividesFromTotal(){
        Calculator calculator = new Calculator();
        calculator.setTotal(4);
        double number1 = 2;
        calculator.getDivide(number1);
        assertThat(calculator.getTotal(), equalTo(2.0));
    }

    @Test
    void calculatorPercentage(){
        Calculator calculator = new Calculator(); // total 0
        calculator.setTotal(100); //total 100
        double percentage = 5; // total 100
        calculator.percentageOf(percentage);
        assertThat(calculator.getTotal(), equalTo((double)5));
    }

    @Test
    void calculatorReturnsTrueIfEven(){
        Calculator calculator = new Calculator();
        double number1 = 22;
        assertTrue(calculator.isEven(number1));
        //assertThat(calculator.isEven(number1), equalTo(Boolean.TRUE));
    }

    @Test
    void calculatorBringsGreaterNumber(){
        Calculator calculator = new Calculator();
        double number1 = 8;
        double number2 = 4;
        assertThat(calculator.getGreater(number1, number2), equalTo(number1));
    }

    @Test
    void calculatorSumsArrayElements(){
        Calculator calculator = new Calculator();
        int[] array = {1, 2, 3, 4};
        //calculator.getTotal();
        calculator.getArraySum(array);
        assertThat(calculator.getTotal(), equalTo((double)10));
    }

    @Test
    void calculatorReturnsListBiggerOrEqualToFive(){
        Calculator calculator = new Calculator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(15);
        List<Integer> filteredList = calculator.getArrayFromFive(numbers);

        assertThat(filteredList.size(), equalTo(2));
    }
}
