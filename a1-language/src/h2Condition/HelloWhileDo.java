package h2Condition;

/**
 * @author liuyanzhao
 */
public class HelloWhileDo {


    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);

        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 10);
    }

}
