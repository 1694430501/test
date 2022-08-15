package com.wz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: wz
 * @date: 2022/8/15 0015
 * Buddha Bless, No Bug !
 */
public class FindEqual {
    public static void main(String[] args) {
        String a = "2";

        List<User> userList = new ArrayList<>();
        userList.add(new User("11", "2"));
        userList.add(new User("1", "12"));
        userList.add(new User("1", "22"));

        User user = userList.stream().filter(s -> Objects.equals(s.getName(), a)).findFirst().orElse(null);
        System.out.println(user);
    }
}
