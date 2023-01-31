package com.sarac;

import com.sarac.DishesTask.Dish;
import com.sarac.DishesTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingAndMatching {

    public static void main(String[] args) {

        //All Match
        System.out.println("All Match");
        boolean isHealty=DishData.gettAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealty);

        //Any Match
        System.out.println("Any Match");
        if (DishData.gettAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("Menu is vegeterian friednly");
        }

        //None Match
        System.out.println("None Match");
        boolean isHealty2=DishData.gettAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println("Menu is healty? "+isHealty2);

        //Find Any
        System.out.println("Find Any");

        Optional<Dish>dish=DishData.gettAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);//Optional type
        System.out.println(dish.get());

        //Find First
        System.out.println("Find First");
        Optional<Dish>dish2=DishData.gettAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish);

        //PARALLEL STREAMS(Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String>list1= Arrays.asList( "Jhonny","David","Jack","Duke","Julia","Jenish","Divya");
        List<String>list2= Arrays.asList( "Jhonny","David","Jack","Duke","Julia","Jenish","Divya");

//        Optional<String>findFirst=list1.parallelStream().filter(s->s.startsWith("D")).findFirst();//David
//        Optional<String>findAny=list2.parallelStream().filter(s->s.startsWith("J")).findAny();//Julia

        Optional<String>findFirst=list1.stream().filter(s->s.startsWith("D")).findFirst();//David
        Optional<String>findAny=list2.stream().filter(s->s.startsWith("J")).findAny();//Jhonny

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //Min and Max Method
        System.out.println("Min");
        Optional<Dish>dishMinimum=DishData.gettAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMinimum);

        System.out.println("Max");
        Optional<Dish>dishMaximum=DishData.gettAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMaximum);
    }
}
