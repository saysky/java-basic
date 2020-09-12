package behavior.interpreter.operation;

/**
 * 被操作的对象，先定义一个实体类，封装两个变量num1、num2
 * @author liuyanzhao
 */
public class Entity {
    private double num1;
    private double num2;

    public Entity(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
