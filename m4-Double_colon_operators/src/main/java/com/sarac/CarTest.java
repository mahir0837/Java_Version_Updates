package com.sarac;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {


        //Zero Argument Constructor

        Supplier<Car>c1=()->new Car();

        Supplier<Car>c2=Car::new;
        System.out.println(c2.get().getModel());
        System.out.println(c1.get().getModel());

        //One Argument Constructor

        Function<Integer,Car>f1=model->new Car(model);
        Function<Integer,Car>f2=Car::new;

        //Two Argument Constructor

        BiFunction<String,Integer,Car>f3=Car::new;
       Car Honda= f3.apply("Honda",2015);
        System.out.println(Honda.getMake()+" "+Honda.getModel());
    }



}
