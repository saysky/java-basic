package create.singleton.bad;

/**
 * 这种则是线程不安全的了。因为当有多个线程一起调用getSingleInstance()时则,可能会生成多个实例
 */

public final class SingletonBad {
    private static SingletonBad singObj = null;

    private SingletonBad() {
    }

    public static SingletonBad getSingleInstance() {
        if (singObj == null) {
            singObj = new SingletonBad();
        }
        return singObj;
    }
}
