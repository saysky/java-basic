package hello2;

/**
 * @author liuyanzhao
 */
public class Box2<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
