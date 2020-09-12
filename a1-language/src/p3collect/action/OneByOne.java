package p3collect.action;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 遍历操作
 * <p>
 * java.util.Iterator接口描述的是以统一方式对各种集合元素进行遍历/迭代的工具，也称"迭代器"。
 * 允许在"遍历"过程中移除集合中的元素
 * @author liuyanzhao
 */
public class OneByOne {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("China");
        a.add("USA");
        a.add("Korea");

        //方式1
        Iterator it = a.iterator();
        while (it.hasNext()) {
            String country = (String) it.next();
            System.out.println("iterator遍历：" + country);
        }


        //方式2
        for (Object o : a) {
            System.out.println("for遍历：" + o);
        }

        //方式3
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
    }
}
