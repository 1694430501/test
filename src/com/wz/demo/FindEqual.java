package com.wz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: wz
 * @date: 2022/8/15 0015
 * Buddha Bless, No Bug !
 */
public class FindEqual {
    public static void main(String[] args) {
        String a = "2";
        //String b = "11";

        List<User> userList = new ArrayList<>();
        //userList.add(new User("222", "2"));
        //userList.add(new User("1", "12"));
        //userList.add(new User("1", "22"));
        //userList.add(new User("111", "2"));

        List<User> user = userList.stream().filter(s -> Objects.equals(s.getName(), a)).collect(Collectors.toList());
        System.out.println(user);

        /*Optional<User> cartOptional = userList.stream().filter(item -> "1".equals(item.getId())).findFirst();
        if (cartOptional.isPresent()) {
            System.out.println("存在");
            User user = cartOptional.get();
            System.out.println(user);
        } else {
            System.out.println("不存在");
        }*/

        userList = addElement(userList);
        System.out.println(userList.size());
    }

    private static List<User> addElement(List<User> userList) {
        userList.add(new User("222", "2"));
        userList.add(new User("1", "12"));
        userList.add(new User("1", "22"));
        userList.add(new User("111", "2"));
        return userList;
    }
}
