package p3collect.container.list;

import java.util.ArrayList;
import java.util.List;

/*
 java.util.ArrayList类实现了List 接口，用于表述长度可变的数组列表。
ArrayList列表允许元素取值为null。除实现了List 接口定义的所有功能外，还提供了一些方法来操作列表容量的大小，
 * 
 * */
public class HelloArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
