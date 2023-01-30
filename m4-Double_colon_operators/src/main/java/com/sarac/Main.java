package com.sarac;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Calculate sum=(x,y)-> System.out.println(x+y);
        Calculate s1=(x,y)-> Calculator.findSum(x,y);

        //Referance to Static Method
        Calculate s2=Calculator::findSum;
        s2.calculate(10,20);

        //Referance to an instance method
        Calculator obj=new Calculator();
        Calculate s3=obj::findMultiply;

        Calculate s4=new Calculator()::findMultiply;

        BiFunction<String, Integer,String>function=(str,i)->str.substring(i);

        BiFunction<String,Integer,String>function1=String::substring;

        Function<Integer,Double>b=new myClass()::method;

        BiFunction<myClass,Integer,Double>b1=myClass::method;

    }
}