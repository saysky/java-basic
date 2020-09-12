package p3collect.container.list;

import java.util.ArrayList;
import java.util.Date;

/*
 java.util.ArrayList类实现了List 接口，用于表述长度可变的数组列表。
ArrayList列表允许元素取值为null。除实现了List 接口定义的所有功能外，还提供了一些方法来操作列表容量的大小，
 * 
 * */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList h = new ArrayList();
        h.add("1st");
        h.add("2nd");
        h.add(new Integer(3));
        h.add(new Double(4.0));
        h.add("2nd"); // 重复元素, 加入
        h.add(new Integer(3)); // 重复元素,加入
        System.out.println(h);
        System.out.println("size=" + h.size());
        System.out.println("-----替换指定元素-----");
        h.set(3, "replace");
        System.out.println("-----for循环遍历-----");
        for (int i = 0; i < h.size(); i++) {
            System.out.println(h.get(i));
        }
        System.out.println("-----取用特定元素-----");
        Integer it = (Integer) h.get(2);
        System.out.println(it.intValue());
        System.out.println("-----插入元素-----");
        h.add(3, new Date());
        System.out.println("-----转换为数组-----");
        Object[] os = h.toArray();
        for (Object o : os) {
            System.out.println(o);
        }
    }
}
