package com.sarac;

import com.sarac.FarmerTask.Apple;
import com.sarac.FarmerTask.AppleClass;
import com.sarac.FarmerTask.Color;
import com.sarac.OrangeTask.Orange;
import com.sarac.OrangeTask.OrangePredicated;

import java.sql.SQLOutput;
import java.util.function.*;


public class FunctionalInterface {


    Apple applePredicate = new Apple() {//Anonymies Class
        @Override
        public boolean test(AppleClass apple) {
            return apple.getColor().equals(Color.GREEN);
        }
    };

    public static void main(String[] args) {


        //*****************PREDICATE**************************//

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));
        System.out.println("---------------------------------------");

        //*****************CONSUMER**************************//
        System.out.println("-----------------------------------");
        Consumer<Integer>display=i-> System.out.println(i);
        display.accept(10);
        System.out.println("-----------------------------------");
        //*****************BI CONSUMER**************************//

        BiConsumer<Integer,Integer>addTwo=(x,y)->System.out.println(x+y);
        addTwo.accept(1,2);

        System.out.println("-----------------------------------");
        //*****************Function**************************//

        Function<String,String>fun=s->"Hello "+s;
        System.out.println(fun.apply("Cydeo"));
        System.out.println("-----------------------------------");
        //*****************Bi Function**************************//
        BiFunction<Integer,Integer,Integer>func=(x,y)->x+y;
        System.out.println(func.apply(2,3));

        System.out.println("-----------------------------------");
        //*****************SUPPLIER**************************//

        Supplier<Double>randomValue=()->Math.random();
        System.out.println(randomValue.get());
    }
}