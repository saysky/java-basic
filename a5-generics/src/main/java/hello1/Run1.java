package hello1;

import java.util.ArrayList;
import java.util.List;


/**
 * @author liuyanzhao
 */
public class Run1 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
            // String name = (String) list.get(i); // 1
            System.out.println("name:" + list.get(i));
        }
    }
}
