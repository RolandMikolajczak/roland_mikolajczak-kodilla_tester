package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.Sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.Sub(a,b);
        assertEquals(-3,subResult);
    }
    @Test
    public void testSquere(){
        Calculator calculator = new Calculator();
        double a = 5;
        BigDecimal c = new BigDecimal (String.format("%.2f", a * a));
        double sqrResult = calculator.Square(a);
        assertEquals(25,sqrResult, String.valueOf(c));
    }
}
