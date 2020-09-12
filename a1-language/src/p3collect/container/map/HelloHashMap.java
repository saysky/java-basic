package p3collect.container.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 给每个对象加一个标签key ，这些对象塞到一个容器里，以后要拿出来的时候，只要提供标签就可以取出来
 * @author liuyanzhao
 */
public class HelloHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "zhangsan");
        map.put("b", "lisi");
        map.put("c", "wangwu");

        System.out.println(map.get("c"));

        /**
         * 方法1遍历map
         */
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("**********************");


        /**
         * 方法2遍历map
         */
        Set keySet = map.keySet();

        for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("**********************");


        /**
         * 方法3，这种方法遍历的是所有的值
         */
        for (String value : map.values()) {
            System.out.println(value);
        }

    }
}
