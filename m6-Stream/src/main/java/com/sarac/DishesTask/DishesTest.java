package com.sarac.DishesTask;

import java.util.Comparator;

public class DishesTest {

    public static void main(String[] args) {


        //Print all dish's name that has less than 400 calories
        DishData.gettAll().stream().filter(p -> p.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("*******************************");

        //Print the length of the name of each dish
        DishData.gettAll().stream().map(p -> p.getName().length())
                .forEach(System.out::println);
        System.out.println("*******************************");
        //Print three high caloric dish name>300

        DishData.gettAll().stream().filter(p -> p.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed()).map(Dish::getName)
                .limit(3).forEach(System.out::println);
        System.out.println("*******************************");
        //Print all dish name that are below 400 calories in sorted

        DishData.gettAll().stream().filter(p -> p.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).forEach(System.out::println);


    }
}
