package hello1;

import java.util.ArrayList;
import java.util.List;


/**
 * @author liuyanzhao
 */
public class Run2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        //list.add(100); 1 提示编译错误

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println("name:" + name);
        }
    }
}
