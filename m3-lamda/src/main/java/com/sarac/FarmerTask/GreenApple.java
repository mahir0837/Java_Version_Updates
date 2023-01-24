package com.sarac.FarmerTask;

public class GreenApple implements Apple {


    @Override
    public boolean test(AppleClass apple) {

        return apple.getColor().equals(Color.GREEN);


    }
}
