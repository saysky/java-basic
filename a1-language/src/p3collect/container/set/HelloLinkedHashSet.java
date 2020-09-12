package p3collect.container.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author liuyanzhao
 */
public class HelloLinkedHashSet {
    /**
     * HashSet不保证集合的迭代顺序；也许在某些时间迭代的顺序与插入顺序一致，但是不保证该顺序恒久不变。
     */
    private static Set mSetInt = new HashSet();
    /**
     * LinkedHashSet按照元素插入的顺序进行迭代，LinkedHashSet不是线程安全的。
     */
    private static Set mLinkedSetInt = Collections.synchronizedSet(new LinkedHashSet());

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            mSetInt.add(i);

            mLinkedSetInt.add(i);

        }

        Iterator setIntIt = mSetInt.iterator();
        System.out.println("The sequence of HashSet for Integer:");
        while (setIntIt.hasNext()) {
            System.out.print(setIntIt.next() + " ");
        }
        System.out.println();


        System.out.println("The sequence of LinkedHashSet for Integer:");
        Iterator linkedSetIntIt = mLinkedSetInt.iterator();
        while (linkedSetIntIt.hasNext()) {
            System.out.print(linkedSetIntIt.next() + " ");
        }
        System.out.println();


    }

}
