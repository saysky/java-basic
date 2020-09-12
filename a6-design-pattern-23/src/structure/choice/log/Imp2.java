package structure.choice.log;

public class Imp2 implements Inf {
    private static Imp2 uniqueInstance;

    public static Imp2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Imp2();
        }
        return uniqueInstance;
    }

    @Override
    public void debug() {
        System.out.println("实现类2 。。。。");

    }

}
