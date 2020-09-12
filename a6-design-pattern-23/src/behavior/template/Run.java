package behavior.template;


public class Run {
    /*
   模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。子类实现算法的某些细节，有助于算法的扩展。通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合"开放-封闭原则"。

   其实就是父子类继承关系

    */
    public static void main(String[] args) {
        Animal a = new Dog();

        a.sleep();
    }

}
