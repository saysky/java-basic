package behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        List mList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            mList.add("第" + i + "数据");
        }

        for (Iterator iterator = mList.iterator(); iterator.hasNext(); ) {
            Object object = (Object) iterator.next();
            System.out.println(object);
        }

    }

}
