package p3collect.container.list;

import java.util.Date;
import java.util.Stack;
/*
 java.util.Stack类继承了Vector类，对应数据结构中以"后进先出"(Last in First out, LIFO)方式存储和操作数据的对象栈。
堆栈类继承Vector，它总是对列表的尾部数据进行操作，采用了先进后出的策略，自定义了插入、查看和弹出元素三个方法。
*/

public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("hello");
        s.push(new Date());
        s.push(400); //自动封装,等价于s.push(new Integer(400));
        s.push(3.14);

        System.out.println("弹栈前:size=" + s.size());
        System.out.println(s.pop());
        System.out.println("弹栈后:size=" + s.size());
        System.out.println(s.peek());
        System.out.println("peek操作后:size=" + s.size());
        while (!s.isEmpty())
            System.out.println(s.pop());
    }
}
