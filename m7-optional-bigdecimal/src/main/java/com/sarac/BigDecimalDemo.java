package com.sarac;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1=374.56;
        double amount2=374.26;
        System.out.println(amount1-amount2);//0.30000000000001137

        BigDecimal b1=new BigDecimal("374.56");
        BigDecimal b2=new BigDecimal("374.26");
        BigDecimal b3=BigDecimal.valueOf(374.56);
        BigDecimal b4=BigDecimal.TEN;
        BigDecimal b5=BigDecimal.ONE;
        System.out.println(b1.subtract(b2));//0.30
        System.out.println(b1.add(b2));//748.82
        System.out.println(b1.add(BigDecimal.TEN));//384.56
        System.out.println(b1.multiply(new BigDecimal("15")));//5618.40
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));//5828.1536
        System.out.println(b4);

    }
}
