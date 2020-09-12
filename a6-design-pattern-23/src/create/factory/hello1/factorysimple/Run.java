package create.factory.hello1.factorysimple;

import create.factory.hello1.factorysimple.model.Aodi;

/**
 * 场景：
 * 简单工厂模式：因为客户有一个工厂来帮他创建宝马.
 * 想要什么车，这个工厂就可以建。
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Aodi car = Factory.create(6);
        System.out.println(car.info());

    }

}
