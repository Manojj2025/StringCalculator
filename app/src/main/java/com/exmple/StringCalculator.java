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

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            Matcher matcher = Pattern.compile("//(\\[.*?])+\\n").matcher(numbers);
            if (matcher.find()) {
                delimiter = extractDelimiters(matcher.group());
                numbers = numbers.substring(matcher.end());
            } else {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }
        }

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

    private String extractDelimiters(String delimiterPart) {
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);
        List<String> delimiters = new ArrayList<>();

        while (matcher.find()) {
            delimiters.add(Pattern.quote(matcher.group(1)));
        }

        return String.join("|", delimiters);
    }
}
