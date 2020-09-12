package hello2;

public class Run {

    /**
     * 使用泛型的基本好处
     * 1.表达的信息更多
     * 2.不用类型转换
     */
    public static void main(String[] args) {
        //1.box1就是个容器，可以放入任何对象
        Box1 box = new Box1();
        box.set(100);

        //2.box2是个有"标签"的容器，让程序员知道这个容器放了什么东西(在盒子里已经做了类型转换)
        Box2 boxString = new Box2();
        boxString.set("corn");

        Box2 boxInteger = new Box2();
        boxInteger.set(100);


    }

}
