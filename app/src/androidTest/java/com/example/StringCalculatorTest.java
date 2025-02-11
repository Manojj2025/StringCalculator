package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import com.exmple.StringCalculator;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.Add(""));
    }
    @Test
    public void testSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.Add("1"));
    }
    @Test
    public void testTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.Add("1,2"));
    }
}