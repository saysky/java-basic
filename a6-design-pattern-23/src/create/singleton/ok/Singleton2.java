package create.singleton.ok;


/**
 * 单实例（懒汉式）
 * 直接满足线程安全， 通过静态内部类实现
 * 内部静态类
 * 一个静态内部类内的一个静态成员就可以保证它只在类被加载时只初始化一次。
 * 因此不管有多少个线程来调用它，都只能得到同个实例。
 */

public class Singleton2 {
    private static class SingletonHolder {
        static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
