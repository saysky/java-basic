package structure.bridge.wifi.bad;

/**
 * B使用了A的信号，但是如果是A使用了B的信息，那就出现循环依赖了
 */
public class Run {

    public static void main(String[] args) {
        RouterB b = new RouterB();
        b.wifi();

    }

}
