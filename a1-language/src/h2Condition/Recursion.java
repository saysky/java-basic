package h2Condition;

public class Recursion {
    public static void main(String[] args) {

        System.out.print(recursion(1));
    }

    public static int recursion(int i) {
        System.out.println(i);
        i++;
        if (i < 5) {
            recursion(i); //自己调用给自己
        }
        return i;
    }

}
