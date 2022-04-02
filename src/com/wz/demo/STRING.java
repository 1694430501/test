package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/04/02
 * str1+str2--->堆中
 * "abcdef"--->常量池中
 */
public class STRING {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1 + str2;
        System.out.println(str3 == "abcdef");// false
    }
}
