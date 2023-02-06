package com.sarac.java9;

import java.util.*;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        //Creating unmodifiable List Before Java9

        List<String> courses= Collections.unmodifiableList(
                Arrays.asList("Java","Spring","Agile")
        );
        courses.add("TS");
        System.out.println(courses);
        //Creating unmodifiable List After Java9

        List<String> myCourses= List.of("Java","Spring","Agile");

        //Creating unmodifiable Set After Java9

        Set<String>myProducts=Set.of("Milk","Bread","Butter");

        //Creating unmodifiable Map After Java9

        Map<String,Integer>myCart=Map.ofEntries(

                Map.entry("Samsung TV",1),
                Map.entry("PSP",5),
                Map.entry("Chair",5)
        );
    }
}
