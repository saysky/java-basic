package create.singleton.ok;


import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式(登记式)
 * 一般是通过一个专门的类对各单例模式的此单一实例进行管理和维护。通过Map方式可以方便的实现此中目的
 */
public class SingleTonManager {

    private static Map singleTonMap = new HashMap();

    public static void main(String[] args) {
        // 获取A类的单例
        A a = (A) getInstance(A.class.getName());
        // 获取B类的单例
        B b = (B) getInstance(B.class.getName());
    }

    // 根据类型获取单例
    public static Object getInstance(String className) {
        if (!singleTonMap.containsKey(className)) {
            try {
                singleTonMap.put(className, Class.forName(className).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return singleTonMap.get(className);
    }
}

class A {

}

class B {

}
