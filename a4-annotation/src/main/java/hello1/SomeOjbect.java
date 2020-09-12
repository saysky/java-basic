package hello1;

import hello1.anno.AnnoHello;

/**
 * @author liuyanzhao
 */
public class SomeOjbect {
    @AnnoHello(configInfo = "算法使用MD5可以反编译算法")
    public void hello() {
        System.out.println("hello 注解");
    }

}
