package com.wz.demo;

import java.math.BigDecimal;

/**
 * @author: wz
 * @date: 2022/6/8 0008
 * Buddha Bless, No Bug !
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.005");
        BigDecimal b = new BigDecimal("0.035");
        BigDecimal c = BigDecimal.valueOf(32);
        //a = a.subtract(b);
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(c.divide(BigDecimal.valueOf(100)).multiply(a).multiply(b));
    }
}
