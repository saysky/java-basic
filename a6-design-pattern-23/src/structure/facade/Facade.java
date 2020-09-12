package structure.facade;

public class Facade {
    ServiceA sa;
    ServiceB sb;
    ServiceC sc;

    public Facade() {
        sa = new ServiceA();
        sb = new ServiceB();
        sc = new ServiceC();
    }

    public void methodA() {
        sa.methodA();
        sb.methodB();
    }

    public void methodB() {
        sb.methodB();
        sc.methodC();
    }

    public void methodC() {
        sc.methodC();
        sa.methodA();
    }
}
