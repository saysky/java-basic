package proper;

import java.util.Iterator;
import java.util.Map;

public class SystemEvn {
    /*
     1.java程序启动就能获取自定义的系统属性我们可以使用 java -Dname=zhuhui
    这样我们就在系统属性中设置了名称为myname值为zhuhui的系统属性，那么就可以通过System.getProperty("name")就可
    以获取到了。

    2.我们也可以将自定义的值定义在系统的环境变量中,那么我们就要用System.genenv(String
     *
     * */
    public static void main(String[] args) {

        System.out.println("JAVA_HOME:" + System.getenv("java_home1"));


        Map m = System.getenv();
        for (Iterator it = m.keySet().iterator(); it.hasNext(); ) {
            String key = (String) it.next();
            String value = (String) m.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("--------------------------------------");

    }

}
