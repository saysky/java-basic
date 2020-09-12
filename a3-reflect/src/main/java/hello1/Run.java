package hello1;

/**
 * 场景：
 * 实现了对业务方法一个拦截器的作用
 * 所有的业务service 的方法，在调用的前后都一段代码
 */
public class Run {
    public static void main(String args[]) {
        /**
         * 会在根路径下生成一个class：/com/sun/proxy/$Proxy0.class
         */
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        DynamicProxyHandler handler = new DynamicProxyHandler();
        ServiceInf business = new UserServiceImp();
        /**
         * 这个bind等于工程返回一个代理对象
         */
        ServiceInf businessProxy = (ServiceInf) handler.bind(business);
        businessProxy.doSomething();
    }
}
