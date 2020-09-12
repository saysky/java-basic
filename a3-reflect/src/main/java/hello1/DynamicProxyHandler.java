package hello1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author liuyanzhao
 */
public class DynamicProxyHandler implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object businessObject;


    public Object bind(Object business) {
        this.businessObject = business;
        return Proxy.newProxyInstance(
                business.getClass().getClassLoader(),
                business.getClass().getInterfaces(),
                this
        );
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        /**
         * 反射语法：这里就是重新定义代理的方法调用，就是调用了被 代理对象的方法
         */
        result = method.invoke(businessObject, args);

        return result;
    }
}
