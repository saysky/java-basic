package hello1;

/**
 * BusinessClass
 *
 * @author liuyanzhao
 */
public class UserServiceImp implements ServiceInf {
    @Override
    public void doSomething() {
        System.out.println("BusinessClass call doSomething method.");
    }
}
