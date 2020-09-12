package behavior.interpreter;

import behavior.interpreter.operation.Entity;
import behavior.interpreter.operation.ImpAddOperation;
import behavior.interpreter.operation.ImpMinusOperation;

/**
 * 客户端测试类
 * 解释器模式(Interpreter)：它定义了对象与对象之间进行某种操作之后会得到什么值。
 * 可以快速扩充操作的语法
 *
 * @author Leo
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 创建加法、减法运算
         */
        ImpAddOperation addOperation = new ImpAddOperation();
        ImpMinusOperation minusOperation = new ImpMinusOperation();
        /**
         * 一、分步运算
         */
        double addResult = addOperation.interpreter(new Entity(20, 30));
        double minusResult = minusOperation.interpreter(new Entity(20, 30));
        System.out.println("addResult = " + addResult);
        System.out.println("minusResult = " + minusResult);
        /**
         * 二、混合运算
         */
        double mixResult = new ImpAddOperation().interpreter(new Entity(
                addOperation.interpreter(new Entity(20, 30)), minusOperation
                .interpreter(new Entity(40, 50))));
        System.out.println("mixResult = " + mixResult);
    }
}
