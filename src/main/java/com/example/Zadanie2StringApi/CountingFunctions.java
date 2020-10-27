package com.example.Zadanie2StringApi;

public class CountingFunctions {
    public static Details count(String word) {
        int amountUpperCase = 0;
        int amountLowerCase = 0;
        int amountDigit = 0;
        int amountSpecial = 0;

        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            if (Character.isUpperCase(c))
                amountUpperCase++;
            else if (Character.isLowerCase(c))
                amountLowerCase++;
            else if (Character.isDigit(c))
                amountDigit++;
            else
                amountSpecial++;
        }
        return new Details(amountUpperCase, amountLowerCase, amountDigit, amountSpecial);
    }
}
