package com.wz.demo;

import java.math.BigDecimal;

/**
 * @author: wz
 * @date: 2022/7/12 0012
 * Buddha Bless, No Bug !
 */
public class BigDecimall {
    public static void main(String[] args) {
        BigDecimal bigd = BigDecimal.valueOf(5.03);
        BigDecimal bigde = BigDecimal.valueOf(5.000);
        System.out.println(bigd.multiply(bigde).stripTrailingZeros());
    }
}
