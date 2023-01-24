package com.sarac.FarmerTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

       AppleClass apple1=new AppleClass(Color.RED,150.0);
       AppleClass apple2=new AppleClass(Color.GREEN,250.0);
       AppleClass apple3=new AppleClass(Color.GREEN,150.0);
       AppleClass apple4=new AppleClass(Color.RED,300.0);

        List<AppleClass>listApple=new ArrayList<>(Arrays.asList(apple1,apple2,apple3,apple4));

        List<AppleClass>heavyApple=filterApples(listApple,new HeavyApple());
        System.out.println("Heavy Apple "+heavyApple);
        List<AppleClass>greenApple=filterApples(listApple,new GreenApple());
        System.out.println("Green Apple "+greenApple);

        System.out.println("-----------------------");

        Apple weightApple=(apple)->apple.getWeight()>200;
        System.out.println(filterApples(listApple, weightApple));


    }

    private static List<AppleClass>filterApples(List<AppleClass>apples,Apple appletest){
       List<AppleClass>result=new ArrayList<>();
       for(AppleClass eachApple:apples){
           if (appletest.test(eachApple)){
               result.add(eachApple);
           }
       }
       return result;
    }



}
