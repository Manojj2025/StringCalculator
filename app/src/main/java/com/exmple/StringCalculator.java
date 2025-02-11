package com.exmple;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
/*
1 Create a simple String calculator with a method signature:
———————————————
int Add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0)
Hints:
- Start with the simplest test case of an empty string and move to one and two numbers
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
- Remember to refactor after each passing test
2 Allow the Add method to handle an unknown amount of numbers
————————————————————————————————
3 Allow the Add method to handle new lines between numbers (instead of commas).
1 the following input is ok: “1\n2,3” (will equal 6)
2 the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
*/
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
//3 Allow the Add method to handle new lines between numbers (instead of commas).

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
//7 Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
————————————————————————————————
//8 Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
————————————————————————————————
//9 make sure you can also handle multiple delimiters with length longer than one char
    private String extractDelimiters(String delimiterPart) {
        Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);
        List<String> delimiters = new ArrayList<>();

        while (matcher.find()) {
            delimiters.add(Pattern.quote(matcher.group(1)));
        }

        return String.join("|", delimiters);
    }
}
