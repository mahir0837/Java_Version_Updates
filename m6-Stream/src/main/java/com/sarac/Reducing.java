package com.sarac;

import com.sarac.DishesTask.Dish;
import com.sarac.DishesTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer>numbers= Arrays.asList(4,5,3,9);

       //int result=numbers.stream().reduce(0,(a,b)->a+b);
        int result=numbers.stream().reduce(0, Integer::sum);

        System.out.println(result);

       int result2= DishData.gettAll().stream()
               .map(Dish::getCalories)
               .reduce(Integer::sum).get();
        System.out.println(result2);

        //Max and Min

        Optional<Integer>min=numbers.stream().reduce(Integer::min);
        Optional<Integer>max=numbers.stream().reduce(Integer::max);
        Optional<Integer>sum=numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());

        //Count
        System.out.println("Count");
        long dishCount=DishData.gettAll().stream().count();
        System.out.println(dishCount);
    }
}
