package structure.choice.log;

public abstract class Logger {
    public static Inf imp;

    static {
        init();
    }

    public static void init() {
        System.out.println("--自动调用static{}中的来构建具体的实现--");
        if (true) {
            imp = new Imp1();
        } else {
            imp = new Imp2();
        }
    }

    public static void debug() {
        System.out.println("虚拟类在init中根据同不的情况不同的实现:");
        imp.debug();
    }
}
