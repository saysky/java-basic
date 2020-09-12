package create.factory.hello2;

import create.factory.hello2.factorymethod.model.Aodi6;
import create.factory.hello3.factoryabstract.model.parent.Aodi;


public class ImpFactoryAodi6 implements InfFactory {

    @Override
    public Aodi createAodi() {

        Aodi6 a6 = new Aodi6();

        return a6;
    }


}
