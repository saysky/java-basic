package create.factory.hello3.factoryabstract;

import create.factory.hello3.factoryabstract.factory.InfFactory;
import create.factory.hello3.factoryabstract.model.parent.Aodi;

/*


 抽象工厂模式时代：
 随着客户的要求越来越高，车需要需要配置空调。
 */
public class Run {
    static InfFactory getFactory(String typeName) throws Exception {
        Class classType = Class.forName("create.factory.hello3.factoryabstract.factory." + typeName);
        Object obj = classType.newInstance();

        return (InfFactory) obj;
    }

    public static void main(String[] args) throws Exception {
        Aodi car = getFactory("ImpFactoryAodi6").createAodi();
        System.out.println(car.info());

    }

}
