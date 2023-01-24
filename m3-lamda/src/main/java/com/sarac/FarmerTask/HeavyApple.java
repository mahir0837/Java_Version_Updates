package com.sarac.FarmerTask;

public class HeavyApple implements Apple {



    @Override
    public boolean test(AppleClass apple) {

        return (apple.getWeight()>200);
    }
}
