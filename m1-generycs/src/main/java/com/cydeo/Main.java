package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("Apple");
        printdoubled(items);
    }

    private static void printdoubled(ArrayList items) {
        for (Object i:items){

            System.out.println((Integer)i*2);
        }
    }
}