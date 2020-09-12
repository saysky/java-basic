package h3key;

public class HelloThis {
    static int a = 0;

    public void fun() {
        int a = 1;
        System.out.println(a);
        this.a = 2;
        System.out.println(a);
    }

    public static void main(String[] args) {
        HelloThis helloThis = new HelloThis();

        System.out.println(a);
        helloThis.fun();
        System.out.println(a);
    }
}
