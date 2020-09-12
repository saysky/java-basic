package com;


import java.lang.reflect.Method;


/**
 * 使用反射机制调用方法
 * 作用
 * 通过java的反射机制动态修改对象的属性
 */
public class Hello2CallWay {


    public static void main(String[] args) throws Exception {
        Person p = new Person();

        //得到方法
        Method method = Person.class.getMethod("setName", String.class);

        //执行方法
        method.invoke(p, "saysky");

        System.out.println("使用反射操作SetName方法后，Person对象的name值是：" + p.getName());


    }

}
