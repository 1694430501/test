package com.wz.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wz
 * @date: 2022/6/22 0022
 * Buddha Bless, No Bug !
 */
public class StringToDateToString {
    public static void main(String[] args) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-31");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        String now = new SimpleDateFormat("M-d").format(date);
        System.out.println(now);
    }
}
