package hello1;

import java.lang.reflect.Method;

import hello1.anno.AnnoHello;

/**
 * 当配置文件使用者
 */
public class Run {
    public static void main(String[] args) {
        for (Method method : SomeOjbect.class.getDeclaredMethods()) {
            AnnoHello annoAlgorithm = method.getAnnotation(AnnoHello.class);
            if (annoAlgorithm != null) {
                System.out.println(method + " 配置信息是 : " + annoAlgorithm.configInfo());
            }
        }
    }

}
