package h2Condition;

/**
 * @author liuyanzhao
 */
public class HelloOuter {
    /**
     * 多层循环会用到outer这个语法定义
     */
    public static void main(String[] args) {
        int i;
        outer:
        while (true) {
            for (i = 0; i < 5; i++) {
                if (i == 3) {
                    break outer;
                } else {
                    System.out.println(i);
                }
            }
        }
    }

}
