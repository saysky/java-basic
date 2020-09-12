package create.singleton.ok;

//这种是线程安全的。因为static变量是在类被加载时（有可能没被实例化）初始化并仅被初始化一次。因为这样就可以保证只有一个singObj被初始化
public final class Singleton1 {
    private static Singleton1 singObj = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getSingleInstance() {
        return singObj;
    }
}
