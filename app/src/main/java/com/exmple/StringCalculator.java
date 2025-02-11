package com.exmple;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n"; // Default delimiters: comma and newline

      

        String[] numArray = numbers.split(delimiter);
        return calculateSum(numArray);
    }

    private int calculateSum(String[] numArray) {
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : numArray) {
            if (num.isEmpty()) continue; // Skip empty values
            int value = Integer.parseInt(num);

            if (value < 0) {
                negativeNumbers.add(value);
            } else if (value <= 1000) {
                sum += value;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }

}
