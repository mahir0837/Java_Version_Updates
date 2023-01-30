package com.sarac;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4);
//        integerList.forEach(System.out::println);

        //Filter
        System.out.println("Filter");
        integerList.stream().
                filter(i->i%2==0)
                .forEach(System.out::println);//2,4

        //Distinct
        System.out.println("Distinct");  //2,4
        integerList.stream().filter(i->i%2==0)
                .distinct().forEach(System.out::println);

        //Limit
        System.out.println("Limit");  //2
        integerList.stream().filter(i->i%2==0)
                .limit(1).forEach(System.out::println);

        //Skip
        System.out.println("Skip");  //4
        integerList.stream().filter(i->i%2==0)
                .skip(1).forEach(System.out::println);

        //Map
        System.out.println("Map"); //6
        integerList.stream().map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);
    }
}
