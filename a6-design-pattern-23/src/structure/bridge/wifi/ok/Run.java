package structure.bridge.wifi.ok;

public class Run {

    public static void main(String[] args) {
        //A使用了B的信息号
        RouterB b = new RouterB(new RouterA());
        b.wifi();

        //B使用了A宽带信息号
        RouterA a = new RouterA(new RouterB());
        a.wifi();

    }

}
