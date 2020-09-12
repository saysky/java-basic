package create.factory.hello2;

import create.factory.hello2.factorymethod.model.Aodi4;
import create.factory.hello3.factoryabstract.model.parent.Aodi;


public class ImpFactoryAodi4 implements InfFactory {

    @Override
    public Aodi createAodi() {
        Aodi4 a4 = new Aodi4();

        return a4;
    }


}
