package hello1;

import java.util.ArrayList;
import java.util.List;


/**
 * 所有的泛型类型在运行时有同样的类(class)，而不管他们的实际类型参数。
 * @author liuyanzhao
 */
public class Run3 {

    public static void main(String[] args) {
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        System.out.println(l1.getClass() == l2.getClass());

        List l3 = new ArrayList();
        List l4 = new ArrayList();
        System.out.println(l3.getClass() == l4.getClass());

    }

}
