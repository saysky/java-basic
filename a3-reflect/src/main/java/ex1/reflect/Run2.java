package ex1.reflect;

import java.lang.reflect.Method;

public class Run2 {

    public static void main(String[] args) throws Exception {

        Object obj = Class.forName("ex1.SomeObject").newInstance();
        Method method = Class.forName("ex1.SomeObject").newInstance().getClass().getMethod("print");
        method.invoke(obj);

    }

}
