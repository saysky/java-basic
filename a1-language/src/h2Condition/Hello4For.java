package h2Condition;

/**
 * @author liuyanzhao
 */
public class Hello4For {

    /**
     * 多定义了一个变量
     */
    public static String var = "hello";

    public static String way(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(way(var));
        }
    }

}
