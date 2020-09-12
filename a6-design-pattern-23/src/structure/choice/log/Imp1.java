package structure.choice.log;

public class Imp1 implements Inf {

    private static Imp1 uniqueInstance;

    public static Imp1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Imp1();
        }
        return uniqueInstance;
    }

    @Override
    public void debug() {
        System.out.println("实现类1。。。。");
    }

}
