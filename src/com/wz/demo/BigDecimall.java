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
        BigDecimal bigde = BigDecimal.valueOf(5.030);
        //System.out.println(bigd.multiply(bigde).stripTrailingZeros());
        /*System.out.println(bigd.compareTo(bigde));
        if(bigd.compareTo(bigde) > -1){
            System.out.println("sdfg");
        }*/
        String bbje = "222";
        String bcfpje = BigDecimal.valueOf(Long.parseLong(bbje)).multiply(BigDecimal.valueOf(0.01)).toString();
        System.out.println(bcfpje);
    }

}
