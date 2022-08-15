package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/7/25 0025
 * Buddha Bless, No Bug !
 */
public class Add {
    public static void main(String[] args) {
        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);
    }
}
