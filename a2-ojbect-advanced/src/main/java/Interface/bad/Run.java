package Interface.bad;

/**
 * 接口虽然也可以实现多态（1个对象）
 *
 * @author liuyanzhao
 */
public class Run {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sleep();
    }

}
