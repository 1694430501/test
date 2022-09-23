package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/9/1 0001
 * Buddha Bless, No Bug !
 */
public class StringAppend {
    public static void main(String[] args) {
        String[] arr = {"a","b","c"};
        StringBuilder sb = new StringBuilder();
        for (String a : arr) {
            sb.append(a).append(",");
        }
        System.out.println(sb.toString());
    }
}
