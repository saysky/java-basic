package com;


import java.lang.reflect.Constructor;

/**
 * 调用构造函数
 */
public class Hello1CreateObject2 {

    public static void main(String[] args) throws Exception {
        Class classType = Person.class;
        Constructor con = classType.getConstructor(String.class, int.class);
        Person person = (Person) con.newInstance("tom", 30);
        System.out.println(person.getName());
    }

}
