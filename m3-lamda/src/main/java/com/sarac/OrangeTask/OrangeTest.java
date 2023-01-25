package com.sarac.OrangeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        Orange orange1 = new Orange(Color.GREEN, 130);
        Orange orange2 = new Orange(Color.GREEN, 50);
        Orange orange3 = new Orange(Color.RED, 110);
        Orange orange4 = new Orange(Color.GREEN, 120);
        Orange orange5 = new Orange(Color.RED, 60);
        List<Orange> orangeList = new ArrayList<>(Arrays.asList
                (orange1, orange2, orange3, orange4, orange5));

OrangePredicated orangeLamda=orange ->"an orange of "+ orange.getWeight()+"g";
        filterOrange(orangeList,orangeLamda);

OrangePredicated fancyFormater =orange->{

    String ch=orange.getWeight()>200?"Heavy":"Light";
    return  "A "+ch+" "+orange.getColor()+" orange";

};
filterOrange(orangeList,fancyFormater);





    }

    private static void filterOrange(List<Orange> allOrange, OrangePredicated test) {

        for (Orange eachOrange : allOrange) {
         String output=test.accept(eachOrange);
            System.out.println(output);
        }

    }
}
