package hello0;

/**
 * @author liuyanzhao
 */
public class ProxyService {
    /**
     * 被代理对象
     */
    public UserServiceImp userService;

    public ProxyService(UserServiceImp businessClass) {
        this.userService = businessClass;
    }

    public void doSomething() {
        System.out.println("运行前");
        this.userService.doSomething();
        System.out.println("运行后");

    }
}
