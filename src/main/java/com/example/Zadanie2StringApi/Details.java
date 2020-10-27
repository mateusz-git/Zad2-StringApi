package com.example.Zadanie2StringApi;

public class Details {
    private int upperCase;
    private int lowerCase;
    private int digitCase;
    private int specialCase;

    public Details(int upperCase, int lowerCase, int digitCase, int specialCase) {
        this.upperCase = upperCase;
        this.lowerCase = lowerCase;
        this.digitCase = digitCase;
        this.specialCase = specialCase;
    }

    public int getUpperCase() {
        return upperCase;
    }

    public int getLowerCase() {
        return lowerCase;
    }

    public int getDigitCase() {
        return digitCase;
    }

    public int getSpecialCase() {
        return specialCase;
    }
}
