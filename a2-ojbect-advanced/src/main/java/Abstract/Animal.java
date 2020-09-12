package Abstract;

/**
 * 显示生活中是有父类子类的关系的， 抽象类就是来表示这一个概念
 * <p>
 * 1.抽象类中可以定义抽象方法 ,也可以定义有实现的方法
 * 2.抽象类主要是作用是继承复用 ，extends
 */
abstract class Animal {

    abstract void eat();

    public void sleep() {
        System.out.println("睡觉");
    }

}
