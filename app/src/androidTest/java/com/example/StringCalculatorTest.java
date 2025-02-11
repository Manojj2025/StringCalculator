package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import com.exmple.StringCalculator;

public class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void testEmptyString() {
        assertEquals(0, calculator.Add(""));
    }
    @Test
    public void testSingleNumber() {
        assertEquals(1, calculator.Add("1"));
    }
    @Test
    public void testTwoNumbers() {
        assertEquals(3, calculator.Add("1,2"));
    }
    @Test
    public void testMultipleNumbers() {
        assertEquals(6, calculator.Add("1,2,3"));
    }
    @Test
    public void testNewlineAsDelimiter() {
        assertEquals(6, calculator.Add("1\n2,3"));
    }
        @Test
    public void testCustomDelimiter() {
        assertEquals(3, calculator.Add("//;\n1;2"));
    }
}