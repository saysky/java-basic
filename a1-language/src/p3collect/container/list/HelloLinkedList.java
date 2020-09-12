package p3collect.container.list;

import java.util.LinkedList;

/*
 LinkedList是用链表结构存储数据的，很适合数据的动态插入和删除，随即访问和遍历速度比较慢。
 另外，它还提供了List没有定义的方法，专门用于操作表头和表尾元素，可以当作堆栈、队列和双向队列使用。 
 * */
public class HelloLinkedList {

    public static void main(String[] args) {
        LinkedList linklist = new LinkedList();
        linklist.add("aaa");
        linklist.add("ccc");
        linklist.add("bbb");

        linklist.addFirst("fff");
        System.out.println("把fff放到列表头：");
        for (int i = 0; i < linklist.size(); i++) {
            System.out.println(linklist.get(i) + " ");
        }
    }

}
