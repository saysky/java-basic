package create.factory.hello2;

import create.factory.hello3.factoryabstract.model.parent.Aodi;

/*
 抽象工厂模式时代：
 随着客户的要求越来越高，宝马车必须配置空调。
 而且这空调必须对应给系列车才能使用。于是这个工厂开始生产宝马车和需要的空调。
 
 
 */
public class Run {
    static InfFactory getFactory(String typeName) throws Exception {
        Class classType = Class.forName("create.factory.hello2." + typeName);
        Object obj = classType.newInstance();
        return (InfFactory) obj;
    }

    public static void main(String[] args) throws Exception {
        Aodi car = getFactory("ImpFactoryAodi6").createAodi();
        System.out.println(car.info());

    }

}
