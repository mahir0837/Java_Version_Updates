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
        System.out.println("How to use switch case with enum");

        switch (Currency.PENNY){

            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;

        }

        System.out.println("Operation task");
        calculator(25.0,25.0,mathOperators.SUM);
        calculator(25,25,mathOperators.MULTIPLLICATION);
        calculator(27,15,mathOperators.SUBTRACTION);
        calculator(26,13,mathOperators.DIVISION);


    }

    private static void calculator(double num1, double num2,mathOperators operators) {
        switch (operators){
            case SUM:
                System.out.println(num1 + num2);
                break;
            case SUBTRACTION:
                System.out.println(num1 - num2);
                break;
            case MULTIPLLICATION:
                System.out.println(num1 * num2);
                break;
            case DIVISION:
                System.out.println(num1 / num2);
                break;
        }


    }
}