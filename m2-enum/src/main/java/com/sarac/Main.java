package com.sarac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c=Currency.DIME;

        System.out.println(c);
        System.out.println(Currency.PENNY);
        System.out.println("How to access all constant");
        Currency[]currencies=Currency.values();
        System.out.println(Arrays.toString(currencies));

        for (Currency eachCurrencies:currencies){
            System.out.println(eachCurrencies);
        }

    }
}