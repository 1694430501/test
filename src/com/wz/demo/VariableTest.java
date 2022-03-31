package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/03/31
 */
public class VariableTest {
    private static int a;
    
    public static void main(String[] args) {
        print();
        
    }

    private static void print() {
        int aaa = 0;
        Integer aa = null;
        int b = 2;
        System.out.println(a);
        System.out.println(aa);
        System.out.println(aaa);
        int c = a;
    }
}
