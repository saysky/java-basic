package h2Condition;

import java.util.HashMap;
import java.util.Map;

/**
 * 传统这样遍历一个Map
 *
 * @author liuyanzhao
 */
public class HelloForEach {
    public static void main(String args[]) {
        Map<String, Integer> items = new HashMap<>(6);
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }
}
