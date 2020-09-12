package h2Condition;

class Ctest {
    int a = 0;

    public void fun(int i) {
        a = i;
        int a = 3;
    }
}

/**
 * @author liuyanzhao
 */
public class Variable {
    public static void main(String[] args) {
        Ctest ctest = new Ctest();
        ctest.fun(4);
        System.out.println(ctest.a);
    }
}
