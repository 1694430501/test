package com.wz.demo;

/**
 * @author: wz
 * @date: 2022/04/16
 * Buddha Bless, No Bug !
 */
// 继承final修饰的类报错
public class Final//extends CloneObject{
{
    public static void main(String[] args) {
        final String a = "dsf";
        //a = "asdf"; 报错
        User user1 = new User();
        User user2 = new User();
        //PropertyUtils.copyProperties(user2, user1);

        //BeanUtils.copyProperties(user1, user2);

        //user2 = (User) user1.clone();

    }

    // 重写父类final修饰的方法报错
    /*@Override
    public void aaa() {
        super.aaa();
    }*/
}
