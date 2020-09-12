package com;

import java.lang.reflect.Field;

/**
 * @author liuyanzhao
 */
public class Hello3DependencyInjection {

    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Class c = (Class) person.getClass();

        Field f[] = c.getDeclaredFields();
        for (int i = 0; i < f.length; i++) {
            if (f[i].getName().equals("name")) {
                f[i].set(person, "tom");
            }
            if (f[i].getName().equals("age")) {
                f[i].set(person, 33);
            }
        }

        System.out.println(person.getName() + " " + person.getAge());

    }
}
