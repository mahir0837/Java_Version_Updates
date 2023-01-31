package com.sarac;

import com.sarac.DishesTask.Dish;
import com.sarac.DishesTask.DishData;
import com.sarac.DishesTask.Type;

import java.util.*;
import java.util.stream.Collectors;


public class CollectorsDemo {

    public static void main(String[] args) {

        //toCollections(Suplier):is used to create a Collection using Collection

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList : returns a Collector interface that gathers the input data into a new list

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet:returns a Collector interface that gathers the input data into a new set

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberList2);

        //toMap(Function,Function):returns a Collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.gettAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction):returns a Collector that produces the sum of a Integer-valued func

        int sum = DishData.gettAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting():returns a Collector that counts the number of the element

        Long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        //avarageingInt(ToIntFunction):return the avarage of the integers passed values
        Double avarageCalories=DishData.gettAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(avarageCalories);

        //joining(): is used to join various elements of chracter or String Array into a single object

        List<String>courses=Arrays.asList("Java","JS","TS");
        String str=courses.stream().collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy():is used to partition a stream of objects(or a set of elements (base on the given predicate))

        Map<Boolean,List<Dish>>veggieDish=DishData.gettAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy(): is used for grouping objects by some property and storing result in a Map Instance

        Map<Type,List<Dish>>dishType=DishData.gettAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);
    }
}
