package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/10/20 0020
 * Buddha Bless, No Bug !
 */
public class StringSubstring {
    public static void main(String[] args) {
        String sub = "32020180125001";
        System.out.println(sub.substring(0,3));
        System.out.println(sub.substring(3,14));
        String id = "id";// id
        String db = sub.substring(0,3);// 单别
        String dh = sub.substring(3,14);// 单号
        System.out.println(id + '\u0002' + db+ '\u0002' + dh);
    }
}
