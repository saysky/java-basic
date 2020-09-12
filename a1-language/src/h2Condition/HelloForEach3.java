package h2Condition;

import java.util.HashMap;
import java.util.Map;

/**
 * 在java8中你可以使用 foreach + 拉姆达表达式遍历
 *
 * @author liuyanzhao
 */
public class HelloForEach3 {
    public static void main(String args[]) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
    }
}
