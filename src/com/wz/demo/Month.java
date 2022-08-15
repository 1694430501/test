package com.wz.demo;

import java.time.LocalDate;

/**
 * @author: wz
 * @date: 2022/7/22 0022
 * Buddha Bless, No Bug !
 */
public class Month {
    public static void main(String[] args) {
        LocalDate lastMonthLocalDate = LocalDate.now().minusMonths(1);
        String yuedu = lastMonthLocalDate.toString().substring(0, 7);//上月度
        LocalDate now = LocalDate.now();
        String nowStr = now.toString();
        System.out.println(lastMonthLocalDate);
        System.out.println(yuedu);
        System.out.println(now);
        System.out.println(nowStr);
    }
}
