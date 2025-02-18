package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import com.exmple.StringCalculator;

public class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();


// testEmptyString Passed to constructor
    @Test
    public void testEmptyString() {
        assertEquals(0, calculator.Add(""));
    }
    // testSingleNumber Passed to constructor
    @Test
    public void testSingleNumber() {
        assertEquals(1, calculator.Add("1"));
    }
     // testTwoNumbers Passed to constructor
    @Test
    public void testTwoNumbers() {
        assertEquals(3, calculator.Add("1,2"));
    }
      // testMultipleNumbers Passed to constructor
    @Test
    public void testMultipleNumbers() {
        assertEquals(6, calculator.Add("1,2,3"));
    }
          // testNewlineAsDelimiter Passed to constructor
    @Test
    public void testNewlineAsDelimiter() {
        assertEquals(6, calculator.Add("1\n2,3"));
    }
        @Test
    public void testCustomDelimiter() {
        assertEquals(3, calculator.Add("//;\n1;2"));
    }
       // testNegativeNumbers Passed to constructor
    @Test
    public void testNegativeNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.Add("1,-2,3,-4"));
        assertEquals("Negatives not allowed: [-2, -4]", exception.getMessage());
    }
     // testIgnoreNumbersAbove1000 Passed to constructor
      @Test
    public void testIgnoreNumbersAbove1000() {
        assertEquals(2, calculator.Add("2,1001"));
    }
// testLongDelimiter Passed to constructor
    @Test
    public void testLongDelimiter() {
        assertEquals(6, calculator.Add("//[***]\n1***2***3"));
    }// testMultipleDelimiters Passed to constructor
     @Test
    public void testMultipleDelimiters() {
        assertEquals(6, calculator.Add("//[*][%]\n1*2%3"));
    }// testMultipleLongDelimiters Passed to constructor
     @Test
    public void testMultipleLongDelimiters() {
        assertEquals(6, calculator.Add("//[***][%%%]\n1***2%%%3"));
    }
}