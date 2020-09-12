package com;

/**
 * 使用反射机制来创建对象
 *
 * @author liuyanzhao
 */
public class Hello1CreateObject {

    public static void main(String[] args) throws Exception {


        Class classType = Class.forName("com.Person");
        Object obj = classType.newInstance();
		/*
		Person tom= (Person)obj;
		tom.setName("tom");
		
		System.out.println(tom.getName());
		*/
        //Person p=new Person();
    }

}
