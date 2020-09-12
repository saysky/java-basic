package h2Condition;

/**
 * @author liuyanzhao
 */
public class HelloBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
    }

}
