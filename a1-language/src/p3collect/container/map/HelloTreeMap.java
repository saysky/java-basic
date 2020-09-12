package p3collect.container.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map<String,String> map = new TreeMap<String,String>();
 * map.put("aaaa", "month");
 * map.put("bbbb", "bread");
 * map.put("ccccc", "attack");
 * @author liuyanzhao
 */
public class HelloTreeMap {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("3-aaaa", "month");
        map.put("2-bbbb", "bread");
        map.put("1-ccccc", "attack");


        Set keys = map.keySet();
        for (Object o : keys) {
            System.out.println(o);
        }

    }
}
