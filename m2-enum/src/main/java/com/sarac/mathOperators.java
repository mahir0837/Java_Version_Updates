package com.sarac;

public enum mathOperators {

    SUM, SUBTRACTION, MULTIPLLICATION, DIVISION;
    //each constant is object (new) of operation
    //thats why it will be print 4 times


    private mathOperators() {

        System.out.println("Constructor");

    }
}
