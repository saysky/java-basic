package h9parachange;

public class ParaChange {
    public static void callMe1(String[] args) {

        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void callMe2(String... args) {

        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"aa", "bb", "cc"};
        ParaChange.callMe1(strArray);

        /**
         * jdk1.5之后的新特性，我们叫它为可变参数，即 varargs 。 之前我们定义可变参数是采用String[] args的方法来声明。jdk1.5之后有了更加简便的方式。
         */
        ParaChange.callMe2("aa", "bb", "cc", "dd");
    }
}
