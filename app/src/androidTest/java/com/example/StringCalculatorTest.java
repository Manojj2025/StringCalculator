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

}