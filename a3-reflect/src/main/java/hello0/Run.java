package hello0;

/**
 * 不使用设计模式
 *
 * @author liuyanzhao
 */
public class Run {
    public static void main(String args[]) {

        ProxyService proxy = new ProxyService(new UserServiceImp());

        proxy.doSomething();
    }
}
