package com.javarush.test.level14.lesson08.home09;

/**
 * Created by proshak on 17.01.2017.
 */
public class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}