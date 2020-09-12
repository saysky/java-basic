package p3collect.container.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * java.util.TreeSet类也实现了java.util.Set，它描述的是Set的一种变体&mdash;&mdash;可以实现排序功能的集合。
 * 在将对象元素添加到TreeSet集中时会自动按照某种比较规则将其插入到有序的对象序列中，以保证TreeSet集合元素组成的对象序列时刻按照"升序"排列。
 * @author liuyanzhao
 */
public class HelloTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("orange");
        ts.add("banana");
        ts.add("apple");
        ts.add("grape");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            String fruit = (String) it.next();
            //按字母进行了排序
            System.out.println(fruit);
        }
    }
}
