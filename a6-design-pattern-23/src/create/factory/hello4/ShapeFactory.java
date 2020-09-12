package create.factory.hello4;

import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory {
    protected abstract Shape create();

    private static Map factories = new HashMap();

    public static void addFactory(String id, ShapeFactory f) {
        factories.put(id, f);
    }

    public static final Shape createShape(String id) {

        if (!factories.containsKey(id)) {
            try {
                Class.forName("create.factory.hello4." + id); //这里就等于构建了自动放入
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Bad shape creation : " + id);
            }
        }
        return ((ShapeFactory) factories.get(id)).create();
    }
}
