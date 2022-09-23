package com.wz.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: wz
 * @date: 2022/7/29 0029
 * Buddha Bless, No Bug !
 */
public class TestMapOrderBy {
    public static void main(String[] args) {
        List<HashMap<String, Object>> baseNum = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(map.get("asd"));
       /* map.put("bjy", "5450");
        map.put("bjlb", "3");
        map.put("cbje", "205031.00");
        map.put("sqrq", "2022-01-04");
        map.put("porq", "          ");
        map.put("id", "3200");
        map.put("gb", "1");
        map.put("sqbm", "82");
        map.put("htjews", "0.00");
        baseNum.add(map);

        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("id", "2511");
        map1.put("sqrq", "2021-08-06");
        map1.put("gb", "1");
        map1.put("bjy", "5450");
        map1.put("bjlb", "3");
        map1.put("cbje", "19391.00");
        map1.put("htjews", "140360.00");
        map1.put("porq", "2021-12-29");
        baseNum.add(map1);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("id", "2732");
        map2.put("sqrq", "2021-12-01");
        map2.put("gb", "0");
        map2.put("bjy", "5456");
        map2.put("bjlb", "5");
        map2.put("cbje", "282832.00");
        map2.put("htjews", "351700.00");
        map2.put("porq", "2021-12-03");
        baseNum.add(map2);

        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("id", "2733");
        map3.put("sqrq", "2021-12-02");
        map3.put("gb", "1");
        map3.put("bjy", "5450");
        map3.put("bjlb", "5");
        map3.put("cbje", "332.00");
        map3.put("htjews", "0.00");
        map3.put("porq", "");
        baseNum.add(map3);


        Map<Object, List<HashMap<String, Object>>> baseNumByBJY= baseNum.stream().collect(Collectors.groupingBy(d -> d.get("bjy")));

        for (Map.Entry<Object, List<HashMap<String, Object>>> entry : baseNumByBJY.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        System.out.println(baseNumByBJY);*/
    }
}
