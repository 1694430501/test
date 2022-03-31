package com.wz.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: wz
 * @date: 2022/03/30
 * Map集合去重 + 4种方法遍历
 */
public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap();
        hm.put("1", "wz");
        hm.put("2", "ls");
        hm.put("3", "zs");
        hm.put("4", "we");
        hm.put("4", "w");
        hm.put(null, "we");
        hm.put(null, null);
        hm.put("5", null);

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
        System.out.println("-----------------------------------------");
        for (String key : hm.keySet()) {
            System.out.println(key);
        }
        for (String value : hm.values()) {
            System.out.println(value);
        }
        System.out.println("-----------------------------------------");
        Iterator<Map.Entry<String, String>> entries = hm.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
        System.out.println("-----------------------------------------");
        for (String key : hm.keySet()) {
            String value = hm.get(key);
            System.out.println( key + "---" + value);
        }
    }
}
